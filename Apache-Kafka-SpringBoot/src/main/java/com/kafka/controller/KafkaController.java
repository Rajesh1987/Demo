package com.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.service.KafkaSender;
import com.kafka.memorynotfound.Sender;

//@RestController
public class KafkaController {
	
	@Autowired
	KafkaSender kafkaSender;
	
	  @Autowired
	  private Sender sender;

	@GetMapping(value = "/producer")
	public String producer(@RequestParam("message") String message) {
		
		kafkaSender.send(message);

		return "Message sent to the Kafka Topic java_in_use_topic Successfully";
	}
	
	@GetMapping(value = "/memorynotfound")
	public String kafkaMessage() {
		
		sender.send(" Spring Kafka Producer and Consumer Example ");

		return "Spring Kafka Producer and Consumer Example Success :) ";
	}

}
