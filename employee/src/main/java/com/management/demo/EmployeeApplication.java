package com.management.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeApplication {

	@Autowired
	EmployeeRepo emrepo;
	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}



}
