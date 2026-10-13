package com.deliveryboy.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deliveryboy.service.KafkaService;

@RestController 
@RequestMapping ("/location")
public class LocationController {
    
    @Autowired
    KafkaService kafkaService;

    @PostMapping ("/update")
    public ResponseEntity<?> updateLocation() {
        // Logic to update location
        int latitude = (int) (Math.random() * 100); // Example latitude
        int longitude = (int) (Math.random() * 100); // Example longitude
        this.kafkaService.updateLocation("("+ latitude + "," + longitude + ")");
        return new ResponseEntity<>(Map.of("message", "Location updated successfully"), HttpStatus.OK);
    }

}
