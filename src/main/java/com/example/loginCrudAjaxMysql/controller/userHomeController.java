package com.example.loginCrudAjaxMysql.controller;


import com.example.loginCrudAjaxMysql.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class userHomeController {

    @Autowired
    EmployeeService employeeService;


    // Method to bind data to Display Employee list from database
    @GetMapping ("home")
    private String viewEmployeeList(Model model){
        model.addAttribute("view", employeeService.viewEmployeeList());

        return "userHome.html";
    }

}
