package com.example.ashiraq2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.ashiraq2.model.Product;

public interface ProductRepo extends JpaRepository<Product,Integer>{

    @Query("SELECT u FROM Person u WHERE u.name LIKE CONCAT(:prefix, '%')")
    public List<Product> getByFirstName(String prefix);
    
    @Query("SELECT u FROM User u WHERE u.name LIKE CONCAT('%', :suffix)")
    public List<Product> getByLastName(String suffix);

    @Query("SELECT u FROM User u order by price")
    public List<Product> getBySortedPrice(String suffix);
    
}
