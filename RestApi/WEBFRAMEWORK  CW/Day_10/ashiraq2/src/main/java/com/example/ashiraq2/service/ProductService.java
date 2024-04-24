package com.example.ashiraq2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ashiraq2.model.Product;
import com.example.ashiraq2.repository.ProductRepo;

@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepo;

    public boolean saveProduct(Product product)
    {
        try
        {
            productRepo.save(product);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }
    
    public List<Product> findByCategoryList(String category)
    {
        return productRepo.findByCategoryList(category);
    }

    public Product updateProduct(int productId, int quantityInStock)
    {
        productRepo.updateQuantity(productId, quantityInStock);
        return productRepo.findById(productId).orElse(null);
    }

    public Product deleteProduct(int productId)
    {
        productRepo.deleteProduct(productId);
        return productRepo.findById(productId).orElse(null);
    }
}