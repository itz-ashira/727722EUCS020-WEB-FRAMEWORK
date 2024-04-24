package com.example.ashiraq1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.ashiraq1.model.Person;
import com.example.ashiraq1.service.PersonService;

import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api")
public class PersonController {
    
    @Autowired
    public  PersonService personService;

    @GetMapping("/person")
    public Person postData(@RequestBody Person param) {
        return personService.postData(param);
    }
    @GetMapping("/person/byAge/{age}")
    public List<Person> GetDataByFirstData(@PathVariable int age) {
        return personService.getByAge(age);
    }

}
