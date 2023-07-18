package com.ale.sneakerstoreapi.service;

import com.ale.sneakerstoreapi.entity.ProductDetail;
import com.ale.sneakerstoreapi.repository.OrderDetailRepository;
import com.ale.sneakerstoreapi.repository.ProductDetailRepository;
import com.ale.sneakerstoreapi.util.MessageContent;
import com.ale.sneakerstoreapi.util.exception.AppException;
import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductDetailServiceImpl implements ProductDetailService {
    private ProductDetailRepository productDetailRepository;
    private OrderDetailRepository orderDetailRepository;

    @Override
    public ProductDetail save(ProductDetail productDetail) {
        return productDetailRepository.save(productDetail);
    }


    @Override
    public void delete(ObjectId id) {
        productDetailRepository.findById(id).ifPresentOrElse(productDetail -> {
            orderDetailRepository.findFirstByProductDetail(productDetail).ifPresentOrElse(orderDetail -> {
                throw new AppException(MessageContent.CAN_NOT_DELETE);
            }, () -> {
                productDetailRepository.deleteById(id);
            });
        }, () -> {
            throw new AppException(MessageContent.ID_DOES_NOT_EXIST);
        });
    }


}
