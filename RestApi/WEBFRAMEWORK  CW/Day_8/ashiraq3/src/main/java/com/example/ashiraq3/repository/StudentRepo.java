package com.example.ashiraq3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.ashiraq3.model.Student;

public interface StudentRepo extends JpaRepository<Student,Integer>{
    @Query("SELECT u FROM Student u WHERE  marks>:marks")
    public List<Student> getByMoreMarks(int marks);
    
    @Query("SELECT u FROM Student u WHERE marks>:marks")
    public List<Student> getByLessMarks(int marks);
    
    
} 