package com.example.loginCrudAjaxMysql.controller;

import com.example.loginCrudAjaxMysql.model.Employee;
import com.example.loginCrudAjaxMysql.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/")
public class RegistrationController {

    @Autowired
     EmployeeService employeeService;

    @GetMapping("registration")
    public String registration() {
        return "registration.html";
    }

    //   Registration save in database
    @PostMapping("registration")
    public String save(Employee employee) {

        employeeService.save(employee);

        return "registration.html";
    }

}




