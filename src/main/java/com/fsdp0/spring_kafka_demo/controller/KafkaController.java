package com.fsdp0.spring_kafka_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.fsdp0.spring_kafka_demo.service.KafkaProducerService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/kafka")
@RequiredArgsConstructor
public class KafkaController {
    private final KafkaProducerService kafkaProducerService;

    @GetMapping
    public void test(@RequestParam String topic, @RequestParam String data) {
        this.kafkaProducerService.send(topic, data);
    }
}
