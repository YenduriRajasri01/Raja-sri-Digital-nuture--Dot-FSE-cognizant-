package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecureController {

    @GetMapping("/public")
    public String publicApi() {
        return "Public endpoint - no authentication needed";
    }

    @GetMapping("/secure")
    public String secureApi() {
        return "Secure endpoint - JWT required";
    }
}