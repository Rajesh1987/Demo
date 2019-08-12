package com.configclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {

		@Autowired
		private Environment env;
	   
	    @RequestMapping("/msg")
	    String getMessage() {
	    	
	    	String message = env.getProperty("msg");
	    	return message;
	    
	    }
	
}
