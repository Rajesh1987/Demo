package com.feignsevice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feignsevice.model.UserDetails;

@RestController
public class FeignServiceController {

	@RequestMapping(value = "/user")
	public ResponseEntity<UserDetails> getUserDetails() {
		
		System.out.println("***** FIRST service is invoked");
		
		UserDetails userDetails = new UserDetails("Rajesh", "Pittsburg", "USA");
		
		ResponseEntity<UserDetails> responseEntity = new ResponseEntity<UserDetails>(userDetails, HttpStatus.OK);
		
		return responseEntity;
		
	}
	
}
