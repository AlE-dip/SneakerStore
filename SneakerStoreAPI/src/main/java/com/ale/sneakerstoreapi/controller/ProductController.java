package com.ale.sneakerstoreapi.controller;

import com.ale.sneakerstoreapi.entity.User;
import com.ale.sneakerstoreapi.mapper.QueryRequest;
import com.ale.sneakerstoreapi.mapper.input.ProductInput;
import com.ale.sneakerstoreapi.mapper.view.ProductView;
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
    @ResponseStatus(HttpStatus.OK)
    public List getProducts(@Valid QueryRequest queryRequest) {
        List<ProductView> products = productService.findAll(queryRequest);
        return products;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public ProductView insertProducts(@Valid @RequestBody ProductInput productInput) {
        ProductView products = productService.create(productInput);
        return products;
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ProductView updateProducts(
            @Valid @RequestBody ProductInput productInput,
            @PathVariable Long id
    ) {
        ProductView products = productService.update(productInput, id);
        return products;
    }
}
