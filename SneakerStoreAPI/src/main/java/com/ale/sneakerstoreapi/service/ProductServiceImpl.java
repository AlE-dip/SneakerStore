package com.ale.sneakerstoreapi.service;

import com.ale.sneakerstoreapi.entity.ProductSize;
import com.ale.sneakerstoreapi.mapper.QueryRequest;
import com.ale.sneakerstoreapi.mapper.input.ProductInput;
import com.ale.sneakerstoreapi.mapper.view.ProductView;
import com.ale.sneakerstoreapi.entity.Product;
import com.ale.sneakerstoreapi.repository.ProductDetailRepository;
import com.ale.sneakerstoreapi.repository.ProductSizeRepository;
import com.ale.sneakerstoreapi.util.MessageContent;
import com.ale.sneakerstoreapi.util.UtilContent;
import com.ale.sneakerstoreapi.repository.ProductRepository;
import com.ale.sneakerstoreapi.util.exception.AppException;
import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;
    private ProductSizeRepository productSizeRepository;
    private ProductDetailRepository productDetailRepository;

    @Override
    public ProductView insert(ProductInput productInput) {
        Product product = ProductInput.toProductInsert(productInput);

        //Add ProductSize
        List<ProductSize> productSizes = new ArrayList<>();
        product.getProductDetails().forEach(productDetail -> {
            productSizes.addAll(productDetail.getProductSizes());
        });
        productSizeRepository.saveAll(productSizes);

        //Add ProductDetail
        productDetailRepository.saveAll(product.getProductDetails());


        productRepository.save(product);

        return ProductView.newInstance(product);
    }

    @Override
    public ProductView update(ProductInput productInput, ObjectId objectId) {
        AtomicReference<ProductView> atomicReference = new AtomicReference<>();
        productRepository.findById(objectId).ifPresentOrElse(product -> {
            Product productUpdate = ProductInput.toProductUpdate(productInput, product);
            productRepository.save(productUpdate);
            atomicReference.set(ProductView.newInstance(productUpdate));
        }, () -> {
            throw new AppException(MessageContent.ID_DOES_NOT_EXIST);
        });
        return atomicReference.get();
    }

    @Override
    public List<ProductView> findAll(QueryRequest queryRequest) {
        PageRequest pageRequest = UtilContent.pageRequest(queryRequest);
        return productRepository.findAll(pageRequest).stream()
                .map(ProductView::newInstance)
                .toList();
    }
}
