package com.ale.sneakerstoreapi.service;

import com.ale.sneakerstoreapi.entity.Order;
import com.ale.sneakerstoreapi.entity.Product;
import com.ale.sneakerstoreapi.entity.ProductSize;
import com.ale.sneakerstoreapi.mapper.QueryRequest;
import com.ale.sneakerstoreapi.mapper.input.OrderInput;
import com.ale.sneakerstoreapi.mapper.input.OrderOwner;
import com.ale.sneakerstoreapi.mapper.view.order.OrderView;
import com.ale.sneakerstoreapi.repository.OrderRepository;
import com.ale.sneakerstoreapi.util.MessageContent;
import com.ale.sneakerstoreapi.util.UtilContent;
import com.ale.sneakerstoreapi.util.exception.AppException;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.net.http.HttpRequest;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {
    private OrderRepository orderRepository;
    private ProductService productService;
    private ProductDetailService productDetailService;
    private ProductSizeService productSizeService;
    private OrderDetailService orderDetailService;
    private PaypalService paypalService;
    private UserService userService;
    private ModelMapper mapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public OrderView create(OrderInput orderInput) {
        Order order = orderInput.toOrder(mapper);

        AtomicReference<Double> total = new AtomicReference<>((double) 0);
        order.getOrderDetails().forEach(orderDetail -> {
            //reduce Inventory in ProductSize
            ProductSize productSize = orderDetail.getProductSize();
            productSizeService.reduceInventory(productSize.getId(), orderDetail.getQuantity());

            //Create OrderDetail
            Product product = productService.findByProductCode(orderDetail.getProduct().getProductCode());
            orderDetail.setProduct(product);
            orderDetail.setDiscount(product.getDiscount());

            orderDetail.setProductDetail(productDetailService.findById(orderDetail.getProductDetail().getId()));

            productSize = productSizeService.findById(productSize.getId());
            orderDetail.setProductSize(productSize);
            orderDetail.setPrice(productSize.getPrice());

//            orderDetailService.create(orderDetail);

            //Calculate total price
            double detailPrice = orderDetail.getPrice() * orderDetail.getQuantity();
            total.updateAndGet(v -> (v + (detailPrice - (detailPrice * product.getDiscount() / 100))));
        });

        order.setTotal(String.format("%.2f", total.get()));
        order.setOrderNumber(UtilContent.ORDER_NUMBER_FORMAT + System.currentTimeMillis());
        order.setUser(userService.findById(order.getUser().getUuid()));

        try {
            paypalService.createOrder(order).get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        orderRepository.save(order);

        return OrderView.newInstance(order, mapper);
    }

    @Override
    public List<OrderView> findAll(QueryRequest queryRequest, OrderOwner orderOwner) {
        PageRequest pageRequest = UtilContent.pageRequest(queryRequest);
        return orderRepository.findAllByUuid(UUID.fromString(orderOwner.getUuid()), pageRequest).stream()
                .map(order -> OrderView.newInstance(order, mapper))
                .toList();
    }

    @Override
    public OrderView getByOrderNumber(String orderNumber, OrderOwner orderOwner) {
        return OrderView.newInstance(findByOrderNumber(orderNumber, orderOwner), mapper);
    }

    @Override
    public Order findByOrderNumber(String orderNumber, OrderOwner orderOwner) {
        Optional<Order> optional = orderRepository.findFirstByOrderNumber(UUID.fromString(orderOwner.getUuid()), orderNumber);
        if(optional.isEmpty()) {
            throw new AppException(MessageContent.DOES_NOT_PERMISSION);
        }
        return optional.get();
    }
}
