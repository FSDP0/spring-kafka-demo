package com.fsdp0.spring_kafka.service;

import java.util.Arrays;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import com.fsdp0.spring_kafka.message.KafkaMessage;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class KafkaConsumerService {
    @KafkaListener(topics = "sum", groupId = "sample-group")
    public void sum(KafkaMessage message) {
        int val = Arrays.stream(message.getValues()).sum();

        log.info("Summation : {}",val);
    }

    @KafkaListener(topics = "min", groupId = "sample-group")
    public void min(KafkaMessage message) {
        int val = Arrays.stream(message.getValues()).min().getAsInt();

        log.info("Minimum : {}",val);
    }

    @KafkaListener(topics = "max", groupId = "sample-group")
    public void max(KafkaMessage message) {
        int val = Arrays.stream(message.getValues()).max().getAsInt();

        log.info("Maximum : {}",val);
    }
}
