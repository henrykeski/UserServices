package com.learn.userservices.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@ComponentScan({"com.learn.userservices"})
public class UserservicesApplication {

	public static void main(String[] args) {
		final SpringApplication application = new SpringApplication(UserservicesApplication.class);
		application.run(args);
	}
}
