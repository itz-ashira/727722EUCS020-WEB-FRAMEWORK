package com.example.ashiraq2.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.ashiraq2.model.Product;
import com.example.ashiraq2.service.ProductService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class ProductController {
      
    @Autowired
    public  ProductService productService;

    @GetMapping("/person")
    public Product postData(@RequestBody Product param) {
        return productService.postData(param);
    }
    @GetMapping("/person/startsWithName/{value}")
    public List<Product> GetDataByFirstData(@PathVariable String value) {
        return productService.getByFirstName(value);
    }
    @GetMapping("/person/endsWithName/{value}")
    public List<Product> GetDataByLastData(@PathVariable String value) {
        return productService.getByLastName(value);
    }
    @GetMapping("/person/sortBy/{value}")
    public List<Product> GetDataBySorttData(@PathVariable String value) {
        return productService.getBySortedPrice(value);
    }
    
}
