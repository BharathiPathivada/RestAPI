package com.learnSpring.RestAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learnSpring.RestAPI.Service.TestService;

@RestController
@RequestMapping("/api/v1")
public class TestController {


    @Autowired
    TestService testService;
    @GetMapping("/hello")
    public String greet() {
        return testService.getmessage();
    }
    
}
