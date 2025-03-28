package com.learnSpring.RestAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learnSpring.RestAPI.Service.TestService;
import com.learnSpring.RestAPI.model.User;

@RestController
@RequestMapping("/api/v1")
public class TestController {


    @Autowired
    TestService testService;
    @GetMapping("/hello")
    public String greet() {
        return "Hello, this is my first REST API application!";
    }

    @GetMapping("/getUser")
    public User getUser() {
        return testService.getUser().orElse(null);
    }

    @PostMapping("/createUser")
    public User createUser(@RequestBody User user) {
        return testService.saveUser(user);
    }
    
}
