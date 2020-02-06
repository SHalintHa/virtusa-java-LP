package com.shalintha.employeeservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @RequestMapping("/hello")
    public String sayHello(){

        return "<h1>Hello</h1>";
    }
}
