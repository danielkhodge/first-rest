package com.hodge.daniel.firstrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.hodge.daniel.firstrest.controller")
public class FirstRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstRestApplication.class, args);
	}

}
