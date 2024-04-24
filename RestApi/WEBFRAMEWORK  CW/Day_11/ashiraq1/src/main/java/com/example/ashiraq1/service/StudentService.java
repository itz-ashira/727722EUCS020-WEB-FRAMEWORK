package com.example.ashiraq1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ashiraq1.model.Student;
import com.example.ashiraq1.model.StudentInfo;
import com.example.ashiraq1.repository.StudentInfoRepository;
import com.example.ashiraq1.repository.StudentRepository;

@Service
public class StudentService {
    public StudentRepository studentRepository;
    public StudentInfoRepository studentInfoRepository;
    public StudentService(StudentRepository studentRepository,StudentInfoRepository studentInfoRepository)
    {
        this.studentRepository = studentRepository;
        this.studentInfoRepository = studentInfoRepository;
    }
    public Student saveStudent(Student student)
    {
        return studentRepository.save(student);
    }
    public StudentInfo saveStudentInfo(StudentInfo studentInfo)
    {
        return studentInfoRepository.save(studentInfo);
    }
    public List<Student> getStudents()
    {
        return studentRepository.findAll();
    }
}
