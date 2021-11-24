/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aashgar.department.repositories;

import com.aashgar.department.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author aashgar
 */
public interface DepartmentRepository extends JpaRepository<Department, Integer>{

    public Department findDepartmentById(Integer departmentId);
    
}
