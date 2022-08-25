package com.mastery.java.task.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class SimpleApplication implements WebMvcConfigurer {
    public static void main(String[] args) {
        SpringApplication.run(SimpleApplication.class, args);
    }
}
