/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aashgar.cloudgateway.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author aashgar
 */
@RestController
public class FallBackController {
    @GetMapping("/employeeservicefallback")
    public String employeeServiceFallBackMethod(){
        return "Employee Service down ...";
    }
    
    @GetMapping("/departmentservicefallback")
    public String departmentServiceFallBackMethod(){
        return "Department Service down ...";
    }
}
