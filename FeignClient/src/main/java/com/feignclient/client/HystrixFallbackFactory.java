package com.feignclient.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import feign.hystrix.FallbackFactory;
@Component
public class HystrixFallbackFactory implements FallbackFactory<UserFeignClient> {
	
	@Autowired
	private HystrixClientFalkback hystrixClientFalkback;

	@Override
	public UserFeignClient create(Throwable clause) {
		hystrixClientFalkback.setClause(clause);
	
		return hystrixClientFalkback;
	}

}
