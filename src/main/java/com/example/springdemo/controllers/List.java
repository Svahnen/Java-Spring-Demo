package com.example.springdemo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class List {
    @RequestMapping("/list")
    public String list(@RequestParam java.util.List<String> id) {
        return "ids: " + id;
    }
}

