package com.example.SIdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("si-components.xml")
public class SIdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SIdemoApplication.class, args);
	}
}
