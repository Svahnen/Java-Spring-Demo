package com.example.springdemo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryDemo {
    @RequestMapping("/query") //http://localhost:8080/query?name=svahnen
    public String Query(@RequestParam String name) {
        return "Hello there " + name;
    }
}
