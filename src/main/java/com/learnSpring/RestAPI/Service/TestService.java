package com.learnSpring.RestAPI.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnSpring.RestAPI.Repository.TestRepository;

@Service
public class TestService {

    @Autowired
     TestRepository repository;
     public String getmessage() {
        return repository.getMessage();
     }
}
