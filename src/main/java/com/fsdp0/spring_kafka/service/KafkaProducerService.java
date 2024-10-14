package com.fsdp0.spring_kafka.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import com.fsdp0.spring_kafka.message.KafkaMessage;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class KafkaProducerService {
    private final KafkaTemplate<String, KafkaMessage> kafkaTemplate;

    public void sumValues(int[] numbers) {
        KafkaMessage message = KafkaMessage.builder().values(numbers).build();

        this.kafkaTemplate.send("sum", message);
    }
    
    public void minValues(int[] numbers) {
        KafkaMessage message = KafkaMessage.builder().values(numbers).build();
    
        this.kafkaTemplate.send("min", message);
        
    }
    
    public void maxValues(int[] numbers) {
        KafkaMessage message = KafkaMessage.builder().values(numbers).build();
    
        this.kafkaTemplate.send("max", message);
    }
}
