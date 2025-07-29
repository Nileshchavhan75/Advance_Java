package com.jspm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"controller", "service"}) // ensures scanning
public class AutowiredAnnotation {

	public static void main(String[] args) {
		SpringApplication.run(AutowiredAnnotation.class, args);
	}
}
