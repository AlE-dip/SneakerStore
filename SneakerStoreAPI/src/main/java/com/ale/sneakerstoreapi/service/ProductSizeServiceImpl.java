package com.ale.sneakerstoreapi.service;

import com.ale.sneakerstoreapi.entity.ProductSize;
import com.ale.sneakerstoreapi.repository.OrderDetailRepository;
import com.ale.sneakerstoreapi.repository.ProductSizeRepository;
import com.ale.sneakerstoreapi.util.MessageContent;
import com.ale.sneakerstoreapi.util.exception.AppException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicReference;

@Service
@AllArgsConstructor
public class ProductSizeServiceImpl implements ProductSizeService {
    private ProductSizeRepository productSizeRepository;
    private OrderDetailRepository orderDetailRepository;

    @Override
    public ProductSize save(ProductSize productSize) {
        return productSizeRepository.save(productSize);
    }

    @Override
    public void delete(Long id) {
        productSizeRepository.findById(id).ifPresentOrElse(productSize -> {
            orderDetailRepository.findFirstByProductSize(productSize).ifPresentOrElse(orderDetail -> {
                throw new AppException(MessageContent.CAN_NOT_DELETE);
            }, () -> {
                productSizeRepository.deleteById(id);
            });
        }, () -> {
            throw new AppException(MessageContent.ID_DOES_NOT_EXIST);
        });
    }

    @Override
    public void reduceInventory(Long id, int quantity) {
        if(productSizeRepository.reduceInventory(id, quantity) != 1) {
            throw new AppException(MessageContent.OUT_OF_STOCK);
        }
    }

    @Override
    public ProductSize findById(Long id) {
        AtomicReference<ProductSize> atomicReference = new AtomicReference<>();
        productSizeRepository.findById(id).ifPresentOrElse(atomicReference::set, () -> {
            throw new AppException(MessageContent.ID_DOES_NOT_EXIST + ProductSize.class.getName());
        });
        return atomicReference.get();
    }
}
