package com.hackathon.test.hackthontest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value="com.hackathon.test.hackthontest.*")
public class HackthontestApplication {

	public static void main(String[] args) {
		SpringApplication.run(HackthontestApplication.class, args);
	}
	
	
	
}
