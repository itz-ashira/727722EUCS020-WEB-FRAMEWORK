package com.example.ashiraq1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.ashiraq1.model.Person;
import com.example.ashiraq1.service.PersonService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class PersonController {
    
    @Autowired
    public  PersonService personService;

    @GetMapping("/person")
    public Person postData(@RequestBody Person param) {
        return personService.postData(param);
    }
    @GetMapping("/person/startsWithName/{value}")
    public List<Person> GetDataByFirstData(@PathVariable String value) {
        return personService.getByFirstName(value);
    }
    @GetMapping("/person/endsWithName/{value}")
    public List<Person> GetDataByLastData(@PathVariable String value) {
        return personService.getByLastName(value);
    }
    

}
