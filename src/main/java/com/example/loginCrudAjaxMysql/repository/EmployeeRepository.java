package com.example.loginCrudAjaxMysql.repository;

import com.example.loginCrudAjaxMysql.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {


//    public Employee findByEmail(String email);
    public List<Employee> findByEmail(String email);
}