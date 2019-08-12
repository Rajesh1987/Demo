package com.feignclient.client;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpStatusCodeException;

import com.feignclient.model.UserDetails;

@Component
public class HystrixClientFalkback implements UserFeignClient {
	
	private Throwable clause;

	public void setClause(Throwable clause) {
		this.clause = clause;
	}

	public ResponseEntity<UserDetails> getUserDetails() {
		
		if( clause instanceof HttpStatusCodeException ) {
			System.out.println("clause is instance of Http status code exception");
		} else {
			System.out.println("clause is NOT an instance of Http status code exception");
		}
		UserDetails ud = new UserDetails("Dummy name", "Dummy location", "dummy country"+ clause.getLocalizedMessage());
		return new ResponseEntity<UserDetails>(ud, HttpStatus.NOT_FOUND);
	}

}
