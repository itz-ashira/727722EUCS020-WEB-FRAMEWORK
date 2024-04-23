package com.example.ashiraq1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.ashiraq1.model.Person;

public interface PersonRepo extends JpaRepository<Person,Integer> {

    @Query("SELECT s FROM Person s where s.age > :Age")
    public List<Person> findByStudentAge(int Age);

}
