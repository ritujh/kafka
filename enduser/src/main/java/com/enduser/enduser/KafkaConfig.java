package com.enduser.enduser;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration 
public class KafkaConfig {

    @KafkaListener (topics = "location-update-topic", groupId = "enduser-group")
    public void UpdatedLocation(String location) {
        // Logic to send the updated location to Kafka topic
        System.out.println("Sending updated location to Kafka: " + location);
    }
}
