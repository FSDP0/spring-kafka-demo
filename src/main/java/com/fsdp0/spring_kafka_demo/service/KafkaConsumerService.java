package com.fsdp0.spring_kafka_demo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class KafkaConsumerService {
    @KafkaListener(topics = "topic", groupId = "group_1")
    public void listener(Object data) {
        log.info("Consumer Received : {}", data);
    }
}
