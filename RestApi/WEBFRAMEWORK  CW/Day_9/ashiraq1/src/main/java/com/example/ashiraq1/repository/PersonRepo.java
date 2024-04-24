package com.example.ashiraq1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.ashiraq1.model.Person;

public interface PersonRepo extends JpaRepository<Person,Integer>{
    

    @Query("SELECT u FROM Person u WHERE u.age=:age")
    public List<Person> getByAge(int age);
    
}
