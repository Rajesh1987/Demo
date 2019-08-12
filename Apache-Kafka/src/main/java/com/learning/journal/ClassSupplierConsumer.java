package com.learning.journal;

import java.util.Arrays;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

public class ClassSupplierConsumer {
	
	 public static void main(String[]args) throws Exception{
         
         String topicName="SupplierTopic";
         String groupName="SupplierTopicGroup";
                         
         Properties props =new Properties();
         props.put("bootstrap.servers","localhost:9092,localhost:9093");
         props.put("group.id",groupName);
         props.put("key.deserializer","org.apache.kafka.common.serialization.StringDeserializer");
         props.put("value.deserializer","org.apache.kafka.common.serialization.StringDeserializer");
                         
         KafkaConsumer consumer =new KafkaConsumer<>(props);
         consumer.subscribe(Arrays.asList(topicName));
                         
         while(true){
             ConsumerRecords records = consumer.poll(100);
             records.forEach( record -> System.out.println(" in for loop "+ record.toString()));
             
             
         }                                
     }

}
