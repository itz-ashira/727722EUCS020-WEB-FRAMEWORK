package com.example.ashiraq2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ashiraq2.model.Product;
import com.example.ashiraq2.repository.ProductRepo;

@Service
public class ProductService {
    @Autowired
    public ProductRepo productRepo;

    public List<Product> getByFirstName(String prefix){
        return productRepo.getByFirstName(prefix);
    }

    public List<Product> getByLastName(String suffix){
        return productRepo.getByLastName(suffix);
    }
    
    public List<Product> getBySortedPrice(String price){
        return productRepo.getBySortedPrice(price);
    }

    public Product postData(Product p) {
        return productRepo.save(p);  
    }
    

}
