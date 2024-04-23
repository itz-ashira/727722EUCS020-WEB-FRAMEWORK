package com.example.ashiraq2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.ashiraq2.model.Course;

public interface CourseRepo extends JpaRepository<Course,Integer>{

    @Query("SELECT s FROM Course s where s.courseName > :courseName")
    public List<Course> findByCourseName(String courseName);
    
} 