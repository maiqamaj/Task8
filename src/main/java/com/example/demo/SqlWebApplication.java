package com.example.demo;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SqlWebApplication{
	HrService Hr;
	public static void main(String[] args) {
		SpringApplication.run(SqlWebApplication.class, args);
	}

	
}
