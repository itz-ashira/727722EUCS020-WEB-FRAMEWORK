package com.example.ce1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ce1.model.AshiraEmployee;
import com.example.ce1.service.AshiraEmployeeService;

@RestController
public class AshiraEmployeeController {
    @Autowired
    AshiraEmployeeService employeeService;

    @PostMapping("/employee")
    public AshiraEmployee setMethod(@RequestBody AshiraEmployee employee)
    {
        return employeeService.setEmployee(employee);
    }

    @GetMapping("/employees-inner-join")
    public List<AshiraEmployee> getInnerMethod()
    {
        return employeeService.getInnerEmployee();
    }

    @GetMapping("/employees-left-outer-join")
    public List<AshiraEmployee> getLeftMethod()
    {
        return employeeService.getLeftOuterEmployee();
    }
}
