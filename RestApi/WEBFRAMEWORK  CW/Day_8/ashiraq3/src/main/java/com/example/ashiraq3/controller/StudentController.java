package com.example.ashiraq3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.ashiraq3.model.Student;
import com.example.ashiraq3.service.StudentService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class StudentController {
    @Autowired
    public  StudentService studentService;

    @GetMapping("/student")
    public Student postData(@RequestBody Student param) {
        return studentService.postData(param);
    }
    @GetMapping("/student/marksGreaterThan/{value}")
    public List<Student> GetDataByFirstData(@PathVariable int value) {
        return studentService.getByMoreMarks(value);
    }
    @GetMapping("/student/marksLesserThan/{value}")
    public List<Student> GetDataByLastData(@PathVariable int value) {
        return studentService.getByLessMarks(value);
    }
    
}
