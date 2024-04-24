package com.example.ashiraq2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ashiraq2.model.Student;
import com.example.ashiraq2.repository.StudentRepository;

@Service
public class StudentService {
    public StudentRepository studentRepository;
    public StudentService(StudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }
    public Student saveStudent(Student student)
    {
        return studentRepository.save(student);
    }
    public List<Student> getStudents()
    {
        return studentRepository.findAll();
    }
}
