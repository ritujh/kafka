# Kafka Learning Project

This project was created to learn Apache Kafka in a practical way.
We built a simple live location tracking flow using two Spring Boot apps:

- Delivery Boy app: sends location updates to Kafka
- End User app: listens to the Kafka topic and reads those updates

This helps us understand how Kafka works in real life, especially for high-volume event-based systems.

## What we are learning

- Kafka is a distributed event streaming platform
- It is used to handle large amounts of data efficiently
- Messages are sent to topics
- Consumers read from those topics
- Kafka helps avoid direct database overload when many updates happen quickly

## Setup

Make sure Java is installed.
This project follows the Kafka quick start guide:
https://kafka.apache.org/quickstart/

## Basic flow

1. Start Kafka server
2. Create a Kafka topic
3. Start the delivery-boy service
4. It sends location updates to the topic
5. Start the end-user service
6. It consumes and processes the updates

## Example project idea

A delivery app sends live location updates like:

- (12, 34)
- (13, 35)
- (14, 36)

These updates are published to Kafka and consumed by the user side in real time.

## Tools used

- Java
- Spring Boot
- Apache Kafka
- Maven

## Notes

This project is meant for learning and understanding Kafka basics, architecture, and message flow in a simple application.
