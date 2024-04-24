package com.example.ashiraq1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.ashiraq1.model.Person;

public interface PersonRepo extends JpaRepository<Person,Integer> {

    @Query("SELECT u FROM Person u WHERE u.name LIKE CONCAT(:prefix, '%')")
    public List<Person> getByFirstName(String prefix);
    
    @Query("SELECT u FROM Person u WHERE u.name LIKE CONCAT('%', :suffix)")
    public List<Person> getByLastName(String suffix);
    
} 
