package com.ale.sneakerstoreapi.service;

import com.ale.sneakerstoreapi.mapper.QueryRequest;
import com.ale.sneakerstoreapi.mapper.input.ProductInput;
import com.ale.sneakerstoreapi.mapper.update.ProductUpdate;
import com.ale.sneakerstoreapi.mapper.view.product.ProductView;
import com.ale.sneakerstoreapi.entity.Product;
import com.ale.sneakerstoreapi.repository.ProductDetailRepository;
import com.ale.sneakerstoreapi.repository.ProductSizeRepository;
import com.ale.sneakerstoreapi.util.MessageContent;
import com.ale.sneakerstoreapi.util.UtilContent;
import com.ale.sneakerstoreapi.repository.ProductRepository;
import com.ale.sneakerstoreapi.util.exception.AppException;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;
    private ProductSizeRepository productSizeRepository;
    private ProductDetailRepository productDetailRepository;
    private ModelMapper mapper;

    @Override
    public ProductView create(ProductInput productInput) {
        Product product = productInput.toProduct(mapper);

        productRepository.save(product);
        String productCode = UtilContent.generateCode(UtilContent.PRODUCT_CODE_FORMAT, product.getId());
        productRepository.updateProductCode(
                product.getId(),
                productCode
        );
        product.setProductCode(productCode);

        return ProductView.newInstance(product, mapper);
    }

    @Override
    public ProductUpdate update(ProductUpdate productUpdate, String productCode) {
        AtomicReference<ProductUpdate> atomicReference = new AtomicReference<>();
        productRepository.findFirstByProductCode(productCode).ifPresentOrElse(product -> {
            productUpdate.updateProduct(product);
            productRepository.save(product);
            atomicReference.set(ProductUpdate.newInstance(product, mapper));
        }, () -> {
            throw new AppException(MessageContent.ID_DOES_NOT_EXIST);
        });
        return atomicReference.get();
    }

    @Override
    public List<ProductView> findAll(QueryRequest queryRequest) {
        PageRequest pageRequest = UtilContent.pageRequest(queryRequest);
        return productRepository.findAll(pageRequest).stream()
                .map(product -> ProductView.newInstance(product, mapper))
                .toList();
    }

    @Override
    public Product findById(Long id) {
        AtomicReference<Product> atomicReference = new AtomicReference<>();
        productRepository.findById(id).ifPresentOrElse(atomicReference::set, () -> {
            throw new AppException(MessageContent.ID_DOES_NOT_EXIST + Product.class.getName());
        });
        return atomicReference.get();
    }

    @Override
    public Product findByProductCode(String productCode) {
        Optional<Product> optional = productRepository.findFirstByProductCode(productCode);
        if(optional.isEmpty()) {
            throw new AppException(MessageContent.ID_DOES_NOT_EXIST);
        }
        return optional.get();
    }

    @Override
    public ProductView getByProductCode(String productCode) {
        Product product = this.findByProductCode(productCode);
        return ProductView.newInstance(product, mapper);
    }
}
