package com.example.ashira3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.ashira3.model.Village;
import com.example.ashira3.service.VillageService;

import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api")
public class VillageController {
    
    @Autowired
    public  VillageService villageService;

    @GetMapping("/village")
    public Village postData(@RequestBody Village param) {
        return villageService.postData(param);
    }
    @GetMapping("/village/{villageId}")
    public Village getDataById(@RequestBody int param) {
        return villageService.getById(param);
    }
    @GetMapping("/village/byName/{villageName}")
    public List<Village> GetDataByFirstData(@PathVariable String value) {
        return villageService.getByName(value);
    }
    @GetMapping("/village/byPopulation/{villagePopulation}")
    public List<Village> GetDataByLastData(@PathVariable int value) {
        return villageService.getByPopulation(value);
    }
    
}
