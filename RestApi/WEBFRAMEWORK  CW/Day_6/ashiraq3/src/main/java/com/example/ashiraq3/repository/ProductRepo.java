package com.example.ashiraq3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ashiraq3.model.Product;

public interface ProductRepo extends JpaRepository<Product,Integer> {

}
