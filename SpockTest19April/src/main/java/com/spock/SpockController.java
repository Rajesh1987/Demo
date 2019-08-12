package com.spock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpockController {
	
	@Autowired
	public SpockService service;
	
	@RequestMapping(value ="/msg", method = RequestMethod.GET)
	public String retriveMsg() {
		
		String message = service.retrieveMessage();
		
		return message;
	}

}
