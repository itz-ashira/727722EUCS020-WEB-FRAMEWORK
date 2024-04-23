package com.example.ashiraq3.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.ashiraq3.model.Door;
import com.example.ashiraq3.service.DoorService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/api")
public class DoorController {
    
     
    @Autowired
    public DoorService DoorService;

    @GetMapping("/door")
    public List<Door> getDataa() {
        return DoorService.getData();
    }

    @GetMapping("/door/{doorId}")
    public Door getOneDataa(@PathVariable int doorId) {
        return DoorService.getOneData(doorId);
    }

    @GetMapping("/door/accessType/{accessType}")
    public List<Door> GetDataByAgee(@PathVariable String accessType) {
        return DoorService.getDataByType(accessType);
    }
    

    @PostMapping("/door")
    public Door postDataa(@RequestBody Door entity) {
        return DoorService.postData(entity);
    }
    
}
