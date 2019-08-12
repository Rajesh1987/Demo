package com.resttemplate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resttemplate.model.UserDetails;
import com.resttemplate.service.impl.LoadBalancedRestTempServiceImpl;
import com.resttemplate.service.impl.RestTemplateServiceImpl;

@RestController
public class RestTemplateController {
		
	@Autowired
	private RestTemplateServiceImpl service;
	
	@Autowired
	private LoadBalancedRestTempServiceImpl laodBalancedService;
	
	@RequestMapping(value = "/user")
	public ResponseEntity<UserDetails> userDetails() {
		
		//ResponseEntity<UserDetails> userDetails = service.getUserDetails();
		ResponseEntity<UserDetails> userDetails = laodBalancedService.getUserDetails();
				
		return userDetails;
		
	}

}
