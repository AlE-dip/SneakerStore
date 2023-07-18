package com.ale.sneakerstoreapi.service;

import com.ale.sneakerstoreapi.entity.OrderDetail;
import com.ale.sneakerstoreapi.entity.ProductSize;
import com.ale.sneakerstoreapi.repository.OrderDetailRepository;
import com.ale.sneakerstoreapi.repository.ProductSizeRepository;
import com.ale.sneakerstoreapi.util.MessageContent;
import com.ale.sneakerstoreapi.util.exception.AppException;
import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

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
    public void delete(ObjectId id) {
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
}
