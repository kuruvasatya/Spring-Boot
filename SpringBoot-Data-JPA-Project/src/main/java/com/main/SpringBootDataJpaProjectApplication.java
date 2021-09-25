package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class SpringBootDataJpaProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataJpaProjectApplication.class, args);
		System.out.println("Application is running");
	}

}
