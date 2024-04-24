package com.example.ashiraq2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ashiraq2.model.StudentInfo;

@Repository
public interface StudentInfoRepository extends JpaRepository<StudentInfo,Integer>{
    
}