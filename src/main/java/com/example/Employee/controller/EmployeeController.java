package com.example.Employee.controller;

import com.example.Employee.model.Employee;
import com.example.Employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController()
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;


    @PostMapping("/saveEmployee")
    public void empSave( @RequestBody Employee employee ) {
        employeeService.empSave(employee);


    }

    @GetMapping("/{empId}")
    public Optional<Employee> getEmpList(@PathVariable("empId") Long empId ){

      return employeeService.getEmpList(empId);







    }
}
