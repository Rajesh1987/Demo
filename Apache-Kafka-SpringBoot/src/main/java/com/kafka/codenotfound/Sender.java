package com.kafka.codenotfound;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Sender {
	
	 private static final Logger LOGGER = LoggerFactory.getLogger(Sender.class);
	
	private String kafkaTopic = "car";
	
	@Autowired
	private KafkaTemplate kafkaTemplate;

	public void send(Car car) {
		LOGGER.info("sending car : "+ car.toString());
		kafkaTemplate.send(kafkaTopic, car);
	}
}
