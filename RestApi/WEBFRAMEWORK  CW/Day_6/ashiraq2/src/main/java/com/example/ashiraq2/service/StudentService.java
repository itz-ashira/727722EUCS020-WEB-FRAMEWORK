package com.example.ashiraq2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.ashiraq2.model.Student;
import com.example.ashiraq2.repository.StudentRepo;

@Service
public class StudentService {
    
    @Autowired
    public StudentRepo studentRepo;

    public Student postData(Student student) {
        return studentRepo.save(student);
    }

    public Page<Student> getAll(int page, int size) {
        PageRequest pageable = PageRequest.of(page, size);
        return studentRepo.findAll(pageable);
    }
    
    public Page<Student> getBySort(int page, int size, String sortBy) {
        PageRequest pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return studentRepo.findAll(pageable);
    }


}
