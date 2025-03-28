package com.learnSpring.RestAPI.Repository;

import org.springframework.stereotype.Repository;

@Repository
public class TestRepository {
    
public String getMessage ()
{
    return "Hello this is my first rest api application";
}
}
