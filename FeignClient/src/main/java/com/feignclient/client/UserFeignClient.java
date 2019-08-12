package com.feignclient.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.feignclient.model.UserDetails;

@FeignClient(name="${feign.client.name}", fallbackFactory = HystrixFallbackFactory.class)
public interface UserFeignClient {
	
	@RequestMapping(value= "/user", method = RequestMethod.GET)
	public ResponseEntity<UserDetails> getUserDetails();
}

