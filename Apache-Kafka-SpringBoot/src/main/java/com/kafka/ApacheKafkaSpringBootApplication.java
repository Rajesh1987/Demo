/*package com.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kafka.codenotfound.Car;
import com.kafka.codenotfound.Sender;

@SpringBootApplication
public class ApacheKafkaSpringBootApplication implements CommandLineRunner {
	

    @Autowired
    private Sender sender;

	public static void main(String[] args) {
		SpringApplication.run(ApacheKafkaSpringBootApplication.class, args);
	}
	
	@Override
    public void run(String... strings) throws Exception {
        sender.send(new Car("HONDA","CIVIC","2013"));
    }
}
*/