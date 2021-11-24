/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aashgar.employee.controllers;

import com.aashgar.employee.models.Employee;
import com.aashgar.employee.models.EmployeeDepartment;
import com.aashgar.employee.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author aashgar
 */
@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    
    @PostMapping("/")
    public Employee saveDepartment(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }
    
    @GetMapping("/{id}")
    public EmployeeDepartment findEmployeeWithDepartment(@PathVariable("id") Integer employeeId){
        return employeeService.findEmployeeWithDepartment(employeeId);
    }
}
