package com.zensar.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello Welcome to SB on AWS training";
	}
	
	
	@GetMapping("/hi")
	public String sayHi() {
		return "Hi Welcome to SB on AWS training";
	}

}
