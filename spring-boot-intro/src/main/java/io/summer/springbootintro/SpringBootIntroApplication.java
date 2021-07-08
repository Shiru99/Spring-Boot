package io.summer.springbootintro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootIntroApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootIntroApplication.class, args);
		/*
			* sets up default configurations
			* starts Spring Application Context
			* performs class path scan
			* starts Tomcat server
		*/
	}

}
