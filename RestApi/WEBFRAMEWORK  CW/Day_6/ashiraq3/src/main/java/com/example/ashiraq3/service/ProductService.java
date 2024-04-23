package com.example.ashiraq3.service;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.ashiraq3.model.Product;
import com.example.ashiraq3.repository.ProductRepo;


@Service
public class ProductService {
    
    @Autowired
    public ProductRepo productRepo;

    public Page<Product> getBySort(String sortBy) {
        PageRequest pageable = PageRequest.of(0, 5, Sort.by(sortBy));
        return productRepo.findAll(pageable);
    }

    public Page<Product> getByColumn(int page, int size) {
        PageRequest pageable = PageRequest.of(page, size);
        return productRepo.findAll(pageable);
    }

    public Page<Product> getByAll(int page, int size, String sortBy) {
        PageRequest pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return productRepo.findAll(pageable);
    }

    public Product postData(@RequestBody Product d){
        return productRepo.save(d);
    }


}
