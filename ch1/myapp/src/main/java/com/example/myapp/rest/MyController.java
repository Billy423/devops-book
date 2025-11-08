package com.example.myapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }
    
}
