package com.learn.userservices.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.learn.userservices", "com.learn.userservices.impl.dao"})
public class UserservicesApplication {

    public static void main(String[] args) {
        final SpringApplication application = new SpringApplication(UserservicesApplication.class);
        application.run(args);
    }
}
