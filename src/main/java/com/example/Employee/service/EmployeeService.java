package com.example.Employee.service;

import com.example.Employee.model.Employee;
import com.example.Employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;



    public void empSave(Employee employee) {

        employeeRepository.save(employee);
    }

    public Optional<Employee> getEmpList( Long empId) {

    return employeeRepository.findById(empId);


    }
}
