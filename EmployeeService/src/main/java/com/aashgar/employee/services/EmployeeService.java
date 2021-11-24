/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aashgar.employee.services;

import com.aashgar.employee.models.Department;
import com.aashgar.employee.models.Employee;
import com.aashgar.employee.models.EmployeeDepartment;
import com.aashgar.employee.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author aashgar
 */
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    
    @Autowired
    private RestTemplate restTemplate;

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee findEmployeeById(Integer employeeId) {
        return employeeRepository.findEmployeeById(employeeId);
    }

    public EmployeeDepartment findEmployeeWithDepartment(Integer employeeId) {
        Employee employee = employeeRepository.findEmployeeById(employeeId);
        EmployeeDepartment employeeDepartment = new EmployeeDepartment();
        Department department =
                restTemplate.getForObject("http://DepartmentService/departments/"+employee.getDept_id(),
                        Department.class);
        employeeDepartment.setEmployee(employee);
        employeeDepartment.setDepartment(department);
        return employeeDepartment;
    }
}
