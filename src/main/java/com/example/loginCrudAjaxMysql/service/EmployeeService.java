package com.example.loginCrudAjaxMysql.service;

import com.example.loginCrudAjaxMysql.model.Employee;

import com.example.loginCrudAjaxMysql.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.dc.pr.PRError;

import java.util.List;


@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    // save in database for registration
    public Employee save(Employee employee) {

        return employeeRepository.save(employee);
    }


    //method for login
    public List<Employee> loginUserByEmail(String email) {
        return employeeRepository.findByEmail(email);
    }


    // Method to display Employee list from database
    public List<Employee> viewEmployeeList() {
        return employeeRepository.findAll();
    }

//    public Employee findByEmail(Employee email) {                     ....here it is returning all employee.......
//        return employeeRepository.findByEmail(email);
//    }
}
