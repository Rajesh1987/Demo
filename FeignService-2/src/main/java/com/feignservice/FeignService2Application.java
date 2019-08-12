package com.feignservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FeignService2Application {

	public static void main(String[] args) {
		SpringApplication.run(FeignService2Application.class, args);
	}
}
