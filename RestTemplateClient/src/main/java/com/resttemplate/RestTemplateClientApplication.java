package com.resttemplate;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.client.RestTemplate;

import com.resttemplate.config.RestTemplateRibbonConfig;

@SpringBootApplication
@EnableHystrixDashboard
@EnableCircuitBreaker
@EnableDiscoveryClient
@ComponentScan(basePackages = {"com.resttemplate"}, excludeFilters={
		  @ComponentScan.Filter(type=FilterType.ASSIGNABLE_TYPE, value=RestTemplateRibbonConfig.class)})
public class RestTemplateClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestTemplateClientApplication.class, args);
	}
	
	@Qualifier("loadBalancedRestTemplate")
	@LoadBalanced
	@Bean
	public RestTemplate loadBalancedRestTemplate() {
		return new RestTemplate();
	}
	
	@Qualifier("nonLoadBalancedRestTemplate")
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
