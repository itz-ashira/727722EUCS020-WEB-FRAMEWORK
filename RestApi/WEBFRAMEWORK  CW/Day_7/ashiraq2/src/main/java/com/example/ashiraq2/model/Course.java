package com.example.ashiraq2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Course {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int courseId;
    
    public String courseName;
    public int creditHours;
    public String instructor;
    public String preRequistics;
    public int maxCapacity;
    public String enrolledStudents;


    public Course(int courseId, String courseName, int creditHours, String instructor, String preRequistics,
            int maxCapacity, String enrolledStudents) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.creditHours = creditHours;
        this.instructor = instructor;
        this.preRequistics = preRequistics;
        this.maxCapacity = maxCapacity;
        this.enrolledStudents = enrolledStudents;
    }
    public Course() {
    }
    public int getCourseId() {
        return courseId;
    }
    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public int getCreditHours() {
        return creditHours;
    }
    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }
    public String getInstructor() {
        return instructor;
    }
    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
    public String getPreRequistics() {
        return preRequistics;
    }
    public void setPreRequistics(String preRequistics) {
        this.preRequistics = preRequistics;
    }
    public int getMaxCapacity() {
        return maxCapacity;
    }
    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
    public String getEnrolledStudents() {
        return enrolledStudents;
    }
    public void setEnrolledStudents(String enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }
    
}
