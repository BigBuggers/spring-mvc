package com.bigbuggers.spring_mvc.service;


import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String getGreetingMessage() {
        return "Hello from Spring MVC with Spring Boot!";
    }
}
