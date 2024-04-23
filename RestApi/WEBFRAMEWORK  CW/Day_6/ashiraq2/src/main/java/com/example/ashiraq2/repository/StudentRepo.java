package com.example.ashiraq2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ashiraq2.model.Student;

public interface StudentRepo extends JpaRepository<Student,Integer> {

}
