package com.example.oauthserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example")
public class OauthResourceServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OauthResourceServerApplication.class, args);
    }

}