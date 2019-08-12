package com.kafka.codenotfound;

import java.util.concurrent.CountDownLatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Receiver {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);

	  private CountDownLatch latch = new CountDownLatch(1);

	  public CountDownLatch getLatch() {
	    return latch;
	  }

	  @KafkaListener(topics = "car")
	  public void receive(Car car) {
	    LOGGER.info("received car='{}'", car.toString());
	    latch.countDown();
	  }

}
