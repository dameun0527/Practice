package com.example.springboot.greeting;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String greet() {
        return "Hello Spring";
    }
}
