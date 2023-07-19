package com.ale.sneakerstoreapi.service;

import com.ale.sneakerstoreapi.entity.Order;
import com.ale.sneakerstoreapi.entity.Product;
import com.ale.sneakerstoreapi.entity.ProductSize;
import com.ale.sneakerstoreapi.mapper.input.OrderInput;
import com.ale.sneakerstoreapi.mapper.view.OrderView;
import com.ale.sneakerstoreapi.repository.OrderRepository;
import com.ale.sneakerstoreapi.util.UtilContent;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.atomic.AtomicReference;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {
    private OrderRepository orderRepository;
    private ProductService productService;
    private ProductDetailService productDetailService;
    private ProductSizeService productSizeService;
    private OrderDetailService orderDetailService;
    private UserService userService;
    private ModelMapper mapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public OrderView create(OrderInput orderInput) {
        Order order = new Order();

        AtomicReference<Double> total = new AtomicReference<>((double) 0);
        order.getOrderDetails().forEach(orderDetail -> {
            //Update ProductSize
            ProductSize productSize = orderDetail.getProductSize();
            productSizeService.reduceInventory(productSize.getId(), orderDetail.getQuantity());

            Product product = productService.findById(orderDetail.getProduct().getId());
            orderDetail.setProduct(product);
            orderDetail.setDiscount(product.getDiscount());

            orderDetail.setProductDetail(productDetailService.findById(orderDetail.getProductDetail().getId()));

            productSize = productSizeService.findById(productSize.getId());
            orderDetail.setProductSize(productSize);
            orderDetail.setPrice(productSize.getPrice());

            //Create OrderDetail
            orderDetailService.create(orderDetail);

            //Calculate total price
            double detailPrice = orderDetail.getPrice() * orderDetail.getQuantity();
            total.updateAndGet(v -> (v + (detailPrice - (detailPrice * product.getDiscount() / 100))));
        });

        order.setTotal(total.get());
        order.setOrderNumber(UtilContent.ORDER_NUMBER_FORMAT + System.currentTimeMillis());
        order.setUser(userService.findById(order.getUser().getUuid()));

        orderRepository.save(order);

        OrderView orderView = new OrderView();
        return orderView;
    }
}
