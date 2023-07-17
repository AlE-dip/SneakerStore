package com.ale.sneakerstoreapi.service;

import com.ale.sneakerstoreapi.mapper.QueryRequest;
import com.ale.sneakerstoreapi.mapper.view.ProductView;
import com.ale.sneakerstoreapi.entity.Product;
import com.ale.sneakerstoreapi.util.UtilContent;
import com.ale.sneakerstoreapi.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;
    @Override
    public Product save(Product product) {
        return productRepository.insert(product);
    }

    @Override
    public List<ProductView> findAll(QueryRequest queryRequest) {
        PageRequest pageRequest = UtilContent.pageRequest(queryRequest);
        return productRepository.findAll(pageRequest).stream()
                .map(ProductView::toProductView)
                .toList();
    }
}
