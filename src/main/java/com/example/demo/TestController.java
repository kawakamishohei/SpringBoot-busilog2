package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
@RestController
public class TestController {
    @GetMapping(path = "/test")
    public String getTest(HttpServletRequest request) {
        System.out.println("haro-");
        System.out.println("通ってくれぇい");
    	return "Hello World!";
    }
}