package com.example.ashira3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ashira3.model.Village;
import com.example.ashira3.repository.VillageRepo;

@Service
public class VillageService {
    
    @Autowired
    public VillageRepo villageRepo;

    public List<Village> getByName(String name){
        return villageRepo.getByName(name);
    }

    public List<Village> getByPopulation(int population){
        return villageRepo.getByPopulation(population);
    }

    public Village getById(int id){
        return villageRepo.findById(id).orElseThrow(()->new Error("Not Found"));
    }

    public Village postData(Village p) {
        return villageRepo.save(p);  
    }


}
