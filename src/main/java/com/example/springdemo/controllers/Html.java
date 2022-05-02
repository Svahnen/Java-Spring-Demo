package com.example.springdemo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Html {
    @RequestMapping("/html")
    public String func(@RequestParam String name) {
        return "<h1>Hello there " + name + "</h1>";
    }
}
