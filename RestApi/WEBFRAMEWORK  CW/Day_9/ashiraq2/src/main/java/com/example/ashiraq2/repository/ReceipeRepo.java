package com.example.ashiraq2.repository;

import org.springframework.data.jpa.repository.Query;

import com.example.ashiraq2.model.Receipe;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ReceipeRepo extends JpaRepository<Receipe,Integer> {
    
    @Query("SELECT u FROM Receipe u WHERE u.name = :name")
    public List<Receipe> getByName(String name);
    
}
