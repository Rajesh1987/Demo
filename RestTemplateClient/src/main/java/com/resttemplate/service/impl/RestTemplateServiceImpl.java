package com.resttemplate.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.resttemplate.model.UserDetails;

@Service
public class RestTemplateServiceImpl {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private EurekaClient discoveryClient;
	
	@HystrixCommand(fallbackMethod = "fallBackMethodUserDetails")
	public ResponseEntity<UserDetails> getUserDetails() {
			
		InstanceInfo instance = discoveryClient.getNextServerFromEureka("FEIGN-SERVICE", false);
		UriComponents uriComp = UriComponentsBuilder.fromHttpUrl(instance.getHomePageUrl())
													.path("user").build();
		String url = "http://localhost:8090/user";
		ResponseEntity<UserDetails> userDetails = restTemplate.exchange(instance.getHomePageUrl()+"user", HttpMethod.GET, null, UserDetails.class);

		System.out.println("Host name  "+instance.getHostName()); // WTLRYARRAGUNTLA.Virtusa.com
		System.out.println("APP name  "+instance.getAppName()); // FEIGN-SERVICE
		System.out.println("Home page url  "+instance.getHomePageUrl()+"user"); //http:// WTLRYARRAGUNTLA.Virtusa.com:8090/
		System.out.println("instance id  "+instance.getInstanceId()); // WTLRYARRAGUNTLA.Virtusa.com:feign-service:8090
				
		return userDetails;
		
	}
	
	public ResponseEntity<UserDetails> fallBackMethodUserDetails() {
		
		UserDetails ud = new UserDetails("Dummy name", "Dummy location", "Dummy country");
		
		return new ResponseEntity<UserDetails>( ud, HttpStatus.INTERNAL_SERVER_ERROR );
		
	}

}
