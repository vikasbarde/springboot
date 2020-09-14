package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.controller","com.example.service","com.example.dao"})
public class DockerWithDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerWithDatabaseApplication.class, args);
	}

}
