package com.feignclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feignclient.client.UserFeignClient;
import com.feignclient.model.UserDetails;

@RestController
public class FeignClientController {
	
	@Autowired
	private UserFeignClient userClient;
	
	@RequestMapping(value = "/user")
	public ResponseEntity<UserDetails> userDetails() {
		System.out.println("Invoking User details service using FEIGN CLIENT");
		
		ResponseEntity<UserDetails> userDetails = userClient.getUserDetails();
		
		return userDetails;
		
	}

}
