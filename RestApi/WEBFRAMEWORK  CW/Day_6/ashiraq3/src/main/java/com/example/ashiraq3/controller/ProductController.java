package com.example.ashiraq3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.ashiraq3.model.Product;
import com.example.ashiraq3.service.ProductService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")
public class ProductController {
    
    @Autowired
    public ProductService productService;

    @GetMapping("/product/sortBy/{sortBy}")
    public ResponseEntity<Page<Product>> getProductsBySort(
            @PathVariable String sortBy) {

        Page<Product> products = productService.getBySort(sortBy);
        return ResponseEntity.ok(products);
    }

    @GetMapping("/product/{offset}/{pageSize}")
    public ResponseEntity<Page<Product>> getProductsByColumn(
            @PathVariable int offset,
            @PathVariable int pageSize) {

        Page<Product> products = productService.getByColumn(offset, pageSize);
        return ResponseEntity.ok(products);
    }

    @GetMapping("/product/{offset}/{pageSize}/{sortBy}")
    public ResponseEntity<Page<Product>> getProductsByAll(
            @PathVariable int page,
            @PathVariable int size,
            @PathVariable String sortBy) {

        Page<Product> products = productService.getByAll(page, size, sortBy);
        return ResponseEntity.ok(products);
    }

    @PostMapping("/children")
    public Product postMethodName(@RequestBody Product entity) {
        return productService.postData(entity);
    }

}
