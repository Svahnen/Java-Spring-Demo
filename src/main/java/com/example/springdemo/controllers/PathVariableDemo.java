package com.example.springdemo.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariableDemo {
    @RequestMapping(value = "/pathvariable/{id}") //http://localhost:8080/pathvariable/4
    public String getPathVariable(@PathVariable("id") int id) {
        return "Path variable value is " + id;
    }
}
