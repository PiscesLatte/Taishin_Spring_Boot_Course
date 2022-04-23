package com.pisceslatte.demo.servise;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String greet(){
        return "Hello! I,m a spring boot service!";
    }
}
