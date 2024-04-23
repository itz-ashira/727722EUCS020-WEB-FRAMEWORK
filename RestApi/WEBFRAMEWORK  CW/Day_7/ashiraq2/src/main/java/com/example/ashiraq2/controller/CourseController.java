package com.example.ashiraq2.controller;


import org.springframework.web.bind.annotation.RestController;

import com.example.ashiraq2.model.Course;
import com.example.ashiraq2.service.CourseService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api")
public class CourseController {
    
    @Autowired
    public CourseService courseService;

    @GetMapping("/course")
    public List<Course> getDataa() {
        return courseService.getData();
    }

    @GetMapping("/course/{courseName}")
    public List<Course> GetDataByAgee(@PathVariable String s) {
        return courseService.getDataByName(s);
    }
    

    @PostMapping("/course")
    public Course postDataa(@RequestBody Course entity) {
        return courseService.postData(entity);
    }
    

}
