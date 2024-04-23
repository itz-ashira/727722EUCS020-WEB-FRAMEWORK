package com.example.ashiraq3.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.ashiraq3.model.Door;

public interface DoorRepo extends JpaRepository<Door,Integer> {
    @Query("SELECT s FROM Door s where s.accessType > :accessType")
    public List<Door> findByAccessType(String accessType);

    
} 
