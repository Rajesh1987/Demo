package com.resttemplate.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.NoOpPing;
import com.netflix.loadbalancer.WeightedResponseTimeRule;


// Rule – Logic component which specifies the load balancing rule we are using in our application
// Ping – A Component which specifies the mechanism we use to determine the server’s availability in real-time

// In 2 scenarios where we need to use ribbon client configuration :
// 1. You need to customize your Ribbon settings for a particular Ribbon client
// 2. You're not using any service discovery

@Configuration
public class RestTemplateRibbonConfig {
	
	 @Autowired
	 IClientConfig ribbonClientConfig;
    
    @Bean
    public IPing ribbonPing(IClientConfig config) {
        return new NoOpPing();
    }
    
    @Bean
    public IRule ribbonRule(IClientConfig config) {
        return new WeightedResponseTimeRule();
    }
    
/*    @Bean
    public IRule ribbonRule(IClientConfig config) {
        return new AvailabilityFilteringRule(); // we override the default ZoneAvoidanceRule
    }*/
    
    /*    
    @Bean
    public IPing ribbonPing(IClientConfig config) {
        return new PingUrl(); //we override default Iping which is a NoOpPing
    }
    
   @Bean
    public IRule ribbonRule(IClientConfig config) {
        return new WeightedResponseTimeRule();
    }*/


}
