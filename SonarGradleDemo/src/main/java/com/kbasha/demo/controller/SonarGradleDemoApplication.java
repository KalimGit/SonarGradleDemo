package com.kbasha.demo.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.kbasha.demo")
@EntityScan("com.kbasha.demo.model")
@EnableJpaRepositories("com.kbasha.demo.repository")
public class SonarGradleDemoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SonarGradleDemoApplication.class, args);
	}
	
	
}

