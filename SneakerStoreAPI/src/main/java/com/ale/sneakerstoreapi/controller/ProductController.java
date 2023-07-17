package com.ale.sneakerstoreapi.controller;

import com.ale.sneakerstoreapi.entity.Product;
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
@RequestMapping("product")

@AllArgsConstructor
public class ProductController {
    private ProductService productService;

    @RolesAllowed(User.Role.Fields.ADMIN)
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List getProducts(@Valid QueryRequest queryRequest) {
        List<ProductView> products = productService.findAll(queryRequest);
        return products;
    }

    @RolesAllowed(User.Role.Fields.ADMIN)
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public ProductView saveProducts(@Valid @RequestBody ProductInput productInput) {
        ProductView products = productService.insert(productInput);
        return products;
    }
}
