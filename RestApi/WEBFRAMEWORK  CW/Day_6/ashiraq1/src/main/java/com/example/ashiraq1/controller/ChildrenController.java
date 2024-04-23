package com.example.ashiraq1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.ashiraq1.model.Children;
import com.example.ashiraq1.service.ChildrenService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api")
public class ChildrenController {
    
    @Autowired
    public ChildrenService childrenService;

    @GetMapping("/children/sortBy/{sortBy}")
    public ResponseEntity<Page<Children>> getProductsBySort(
            @PathVariable String sortBy) {

        Page<Children> products = childrenService.getBySort(sortBy);
        return ResponseEntity.ok(products);
    }

    @GetMapping("/children/{offset}/{pageSize}")
    public ResponseEntity<Page<Children>> getProductsByColumn(
            @PathVariable int offset,
            @PathVariable int pageSize) {

        Page<Children> products = childrenService.getByColumn(offset, pageSize);
        return ResponseEntity.ok(products);
    }

    @GetMapping("/children/{offset}/{pageSize}/{sortBy}")
    public ResponseEntity<Page<Children>> getProductsByAll(
            @PathVariable int page,
            @PathVariable int size,
            @PathVariable String sortBy) {

        Page<Children> products = childrenService.getByAll(page, size, sortBy);
        return ResponseEntity.ok(products);
    }

    @PostMapping("/children")
    public Children postMethodName(@RequestBody Children entity) {
        return childrenService.postData(entity);
    }
    

}
