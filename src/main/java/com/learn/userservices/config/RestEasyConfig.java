package com.learn.userservices.config;

import com.learn.userservices.service.UserService;
import org.jboss.resteasy.plugins.spring.SpringResourceFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.ws.rs.ext.Provider;

@Provider
@Configuration
public class RestEasyConfig {

    @Autowired
    private BeanFactory beanFactory;

    @Bean
    public SpringResourceFactory apiController() {
        SpringResourceFactory factory = new SpringResourceFactory("bean1", beanFactory, UserService.class);
        return factory;
    }
}
