package com.ale.sneakerstoreapi.controller;

import com.ale.sneakerstoreapi.entity.User;
import com.ale.sneakerstoreapi.mapper.QueryRequest;
import com.ale.sneakerstoreapi.mapper.view.ProductView;
import com.ale.sneakerstoreapi.service.ProductService;
import jakarta.annotation.security.RolesAllowed;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("product")

@AllArgsConstructor
public class ProductController {
    private ProductService productService;

    @RolesAllowed(User.Role.Fields.ADMIN)
    @GetMapping("s")
    @ResponseStatus(HttpStatus.OK)
    public List getProducts(@Valid QueryRequest queryRequest) {
        List<ProductView> products = productService.findAll(queryRequest);
        return products;
    }

    @RolesAllowed(User.Role.Fields.CUSTOMER)
    @GetMapping("user")
    @ResponseStatus(HttpStatus.OK)
    public String get() {
        return "products";
    }
}
