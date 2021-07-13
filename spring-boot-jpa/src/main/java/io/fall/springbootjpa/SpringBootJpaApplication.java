package io.fall.springbootjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJpaApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaApplication.class, args);
		/*
			* sets up default configurations
			* starts Spring Application Context
			* performs class path scan
			* starts Tomcat server
		*/
	}
}
