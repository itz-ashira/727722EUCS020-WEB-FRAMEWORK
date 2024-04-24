package com.example.ashiraq2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ashiraq2.model.Receipe;
import com.example.ashiraq2.repository.ReceipeRepo;

@Service
public class ReceipeService {
 
    @Autowired
    public ReceipeRepo receipeRepo;

    public List<Receipe> getByName(String name){
        return receipeRepo.getByName(name);
    }

    public Receipe getById(int id){
        return receipeRepo.findById(id).orElseThrow(()->new Error("Not Found"));
    }

    public Receipe postData(Receipe p) {
        return receipeRepo.save(p);  
    }

}
