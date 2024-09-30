package com.fsdp0.spring_kafka_demo.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class KafkaProducerService {
    private final KafkaTemplate<String, Object> kafkaTemplate;

    public void send(String topic, String data) {
        log.info("Producer Send, Topic: {}, Data: {}", topic, data);

        this.kafkaTemplate.send(topic, data);
    }
}
