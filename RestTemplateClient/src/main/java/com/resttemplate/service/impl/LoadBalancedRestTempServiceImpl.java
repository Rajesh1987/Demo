package com.resttemplate.service.impl;
import static com.resttemplate.constants.UserDetailsConstant.USER_DETAILS_HOST_NAME;
import static com.resttemplate.constants.UserDetailsConstant.USER_DETAILS_PATH;
import static com.resttemplate.constants.UserDetailsConstant.USER_DETAILS_SERVICE_NAME;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.resttemplate.config.RestTemplateRibbonConfig;
import com.resttemplate.model.UserDetails;

@RibbonClient(name = USER_DETAILS_SERVICE_NAME, configuration = RestTemplateRibbonConfig.class)
@Service
public class LoadBalancedRestTempServiceImpl {
	
	@Autowired
	private RestTemplate loadBalancedRestTemplate;
	
	@HystrixCommand(fallbackMethod = "fallBackMethodUserDetails")
	public ResponseEntity<UserDetails> getUserDetails() {

		UriComponents uriComp = UriComponentsBuilder.fromHttpUrl(USER_DETAILS_HOST_NAME)
														.path(USER_DETAILS_PATH)
															.build();
		
		ResponseEntity<UserDetails> userDetails = loadBalancedRestTemplate.exchange(uriComp.toString(), HttpMethod.GET, null, UserDetails.class);
				
		return userDetails;
		
	}
	
	public ResponseEntity<UserDetails> fallBackMethodUserDetails() {
		
		UserDetails ud = new UserDetails("Dummy name", "Dummy location", "Dummy country");
		
		return new ResponseEntity<UserDetails>( ud, HttpStatus.INTERNAL_SERVER_ERROR );
		
	}

}
