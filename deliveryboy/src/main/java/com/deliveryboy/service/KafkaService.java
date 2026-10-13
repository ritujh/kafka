package com.deliveryboy.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.deliveryboy.config.AppConstants;

@Service 
public class KafkaService {

    @Autowired 
    KafkaTemplate<String, String> kafkaTemplate;

    private Logger logger = LoggerFactory.getLogger(KafkaService.class);

    public  boolean updateLocation(String message) {
        try {
            kafkaTemplate.send(AppConstants.LOCATION_UPDATE_TOPIC, message);
            this.logger.info("Message sent to Kafka topic: " + AppConstants.LOCATION_UPDATE_TOPIC + " with message: " + message);
            return true;
        } catch (Exception e) {
            this.logger.error("Error occurred while sending message to Kafka topic: " + AppConstants.LOCATION_UPDATE_TOPIC, e);
            return false;
        }
    }
    
}
