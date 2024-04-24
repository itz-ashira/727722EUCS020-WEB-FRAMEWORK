package com.example.ashiraq3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ashiraq3.model.Student;
import com.example.ashiraq3.repository.StudentRepo;

@Service
public class StudentService {
    @Autowired
    public StudentRepo personRepo;

    public List<Student> getByMoreMarks(int marks){
        return personRepo.getByMoreMarks(marks);
    }

    public List<Student> getByLessMarks(int marks){
        return personRepo.getByLessMarks(marks);
    }

    public Student postData(Student p) {
        return personRepo.save(p);  
    }
}
