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
public class LoginController {


    @Autowired
    EmployeeService employeeService;

    @GetMapping("login")
    public String login(){

        return "login.html";
    }

    //   Registration save in database
    @PostMapping("home")
    public String loginUserByEmail(String email) {

        employeeService.loginUserByEmail(email);

        return "userHome.html";
    }
}
