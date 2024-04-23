package com.example.ashiraq1.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.ashiraq1.model.Person;
import com.example.ashiraq1.service.PersonService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/api")
public class PersonController {
    
    @Autowired
    public PersonService personService;

    @GetMapping("/person")
    public List<Person> getDataa() {
        return personService.getData();
    }

    @GetMapping("/person/byAge")
    public List<Person> GetDataByAgee() {
        return personService.getDataByAge(2);
    }
    

    @PostMapping("/person")
    public Person postDataa(@RequestBody Person entity) {
        return personService.postData(entity);
    }
    
    

}
