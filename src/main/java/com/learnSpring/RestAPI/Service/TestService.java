package com.learnSpring.RestAPI.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnSpring.RestAPI.Repository.TestRepository;
import com.learnSpring.RestAPI.model.User;

@Service
public class TestService {

    @Autowired
     TestRepository repository;
     public Optional<User> getUser() {
        return repository.findByName("Bharathi");
     }

     public User saveUser(User user) {
        return repository.save(user);
     }

     
}
