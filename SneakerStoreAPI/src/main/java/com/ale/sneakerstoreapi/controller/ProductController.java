package com.ale.sneakerstoreapi.controller;

import com.ale.sneakerstoreapi.entity.User;
import com.ale.sneakerstoreapi.mapper.QueryRequest;
import com.ale.sneakerstoreapi.mapper.input.ProductInput;
import com.ale.sneakerstoreapi.mapper.update.ProductUpdate;
import com.ale.sneakerstoreapi.mapper.view.product.ProductView;
import com.ale.sneakerstoreapi.service.ProductService;
import jakarta.annotation.security.RolesAllowed;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RolesAllowed(User.Role.Fields.ADMIN)
@RequestMapping("product")
@AllArgsConstructor
public class ProductController {
    private ProductService productService;

    @GetMapping
    @RolesAllowed({User.Role.Fields.ADMIN, User.Role.Fields.CUSTOMER})
    @ResponseStatus(HttpStatus.OK)
    public List getProducts(@Valid QueryRequest queryRequest) throws InterruptedException {
        List<ProductView> products = productService.findAll(queryRequest);
        return products;
    }

    @GetMapping("/{productCode}")
    @RolesAllowed({User.Role.Fields.ADMIN, User.Role.Fields.CUSTOMER})
    @ResponseStatus(HttpStatus.OK)
    public ProductView getProduct(@PathVariable String productCode) {
        ProductView product = productService.getByProductCode(productCode);
        return product;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public ProductView insertProducts(@Valid @RequestBody ProductInput productInput) {
        ProductView products = productService.create(productInput);
        return products;
    }

    @PutMapping("/{productCode}")
    @ResponseStatus(HttpStatus.OK)
    public ProductUpdate updateProducts(
            @Valid @RequestBody ProductUpdate productUpdate,
            @PathVariable String productCode
    ) {
        ProductUpdate products = productService.update(productUpdate, productCode);
        return products;
    }
}
