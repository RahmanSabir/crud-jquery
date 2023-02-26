package com.example.loginCrudAjaxMysql.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Employee {

    @Id
    @GeneratedValue
    private Long id;

//
//    private String name;

//    private int number;

//    private String designation;


    private String name;
    private String gender;

    private String email;
    private int number;

    private String designation;

}
