/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aashgar.employee.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author aashgar
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDepartment {
    private Employee employee;
    private Department department;
}
