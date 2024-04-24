package com.example.ashiraq2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.ashiraq2.model.Receipe;
import com.example.ashiraq2.service.ReceipeService;

import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api")
public class ReceipeController {
    
    @Autowired
    public  ReceipeService receipeService;

    @GetMapping("/receipe")
    public Receipe postData(@RequestBody Receipe param) {
        return receipeService.postData(param);
    }
    @GetMapping("/receipe/byname")
    public List<Receipe> GetDataByFirstData(@RequestParam String  receipeName) {
        return receipeService.getByName(receipeName);
    }
    @GetMapping("/receipe/endsWithName/{receipeId}")
    public Receipe GetDataByLastData(@PathVariable int value) {
        return receipeService.getById(value);
    }
    

}
