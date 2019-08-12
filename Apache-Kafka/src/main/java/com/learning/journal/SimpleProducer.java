package com.learning.journal;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

public class SimpleProducer {
	
	public static void main(String[] args) throws Exception{

        String key = "Key2";   
        String value = "Value-2";
        String topicName = "SimpleProducerTopic";
                            
        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092,localhost:9093");
        props.put("key.serializer","org.apache.kafka.common.serialization.StringSerializer");         
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
                            
        Producer producer = new KafkaProducer<>(props);
                            
        ProducerRecord record = new ProducerRecord<>(topicName,key,value);

        producer.send(record);  
        producer.close();
        System.out.println("SimpleProducer Completed.");
}

}
