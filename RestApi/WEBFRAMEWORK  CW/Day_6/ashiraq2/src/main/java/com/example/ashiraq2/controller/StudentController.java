package com.example.ashiraq2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.ashiraq2.model.Student;
import com.example.ashiraq2.service.StudentService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    public StudentService studentService;

    @GetMapping("/student")
    public ResponseEntity<Page<Student>> getData() {

        Page<Student> products = studentService.getAll(0, 5);
        return ResponseEntity.ok(products);
    }
    
    @GetMapping("/student/sort")
    public ResponseEntity<Page<Student>> getBySort() {

        Page<Student> products = studentService.getBySort(0, 5, "name");
        return ResponseEntity.ok(products);
    }

    @PostMapping("/student")
    public Student postMethodName(@RequestBody Student entity) {
        return studentService.postData(entity);
    }
    
    

}
