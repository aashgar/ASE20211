/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aashgar.employee.repositories;

import com.aashgar.employee.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author aashgar
 */
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

    public Employee findEmployeeById(Integer employeeId); 
}
