package com.learnSpring.RestAPI.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learnSpring.RestAPI.model.User;

@Repository
public interface TestRepository extends JpaRepository<User, Long> {
    // This interface will automatically be implemented by Spring Data JPA
    // You can define custom query methods here if needed

    Optional<User> findByName(String name);
    Optional<User> findByEmail(String email);

}
