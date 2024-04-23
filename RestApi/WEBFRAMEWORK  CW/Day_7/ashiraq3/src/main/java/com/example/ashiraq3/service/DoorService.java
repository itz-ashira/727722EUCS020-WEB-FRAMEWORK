package com.example.ashiraq3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ashiraq3.model.Door;
import com.example.ashiraq3.repository.DoorRepo;

@Service
public class DoorService {
    
    @Autowired
    public DoorRepo DoorRepo;

    public List<Door> getData(){
        return DoorRepo.findAll();
    }    
    public Door getOneData(int id){
        return DoorRepo.findById(id).orElseThrow(()->new Error("Not FOund"));
    }    
    public List<Door> getDataByType(String type){
        return DoorRepo.findByAccessType(type);
    }    
    public Door postData(Door p){
        return DoorRepo.save(p);
    }

}
