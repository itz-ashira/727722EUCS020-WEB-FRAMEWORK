package com.example.ashiraq1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.ashiraq1.model.Children;
import com.example.ashiraq1.repository.ChildrenRepo;


@Service
public class ChildrenService {
    
    @Autowired
    public ChildrenRepo childrenRepo;

    public Page<Children> getBySort(String sortBy) {
        PageRequest pageable = PageRequest.of(0, 5, Sort.by(sortBy));
        return childrenRepo.findAll(pageable);
    }

    public Page<Children> getByColumn(int page, int size) {
        PageRequest pageable = PageRequest.of(page, size);
        return childrenRepo.findAll(pageable);
    }

    public Page<Children> getByAll(int page, int size, String sortBy) {
        PageRequest pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return childrenRepo.findAll(pageable);
    }

    public Children postData(@RequestBody Children d){
        return childrenRepo.save(d);
    }

}
