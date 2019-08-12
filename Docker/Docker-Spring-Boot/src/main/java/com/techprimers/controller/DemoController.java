package com.techprimers.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/docker/details")
	public String details() {
		
		return "Hello world from Docker Spring Boot application";
	}

}
