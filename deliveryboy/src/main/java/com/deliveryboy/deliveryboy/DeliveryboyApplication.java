package com.deliveryboy.deliveryboy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.deliveryboy")
public class DeliveryboyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliveryboyApplication.class, args);
	}

}
