package com.zensar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SampleSbApplication {

	public static void main(String[] args) {
		System.out.println("Hi");
		SpringApplication.run(SampleSbApplication.class, args);
	}

	
	
	
	

}
