package com.fsdp0.spring_kafka.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fsdp0.spring_kafka.service.KafkaProducerService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@Tag(name = "[0001]. Kafka Test REST API")
@RestController
@RequestMapping("/api/v1/kafka")
@RequiredArgsConstructor
public class KafkaProducerController {
    private final KafkaProducerService kafkaProducerService;

    @Operation(summary = "summation")
    @PostMapping("sum")
    public void sum(@RequestBody() int[] numbers) {
        this.kafkaProducerService.sumValues(numbers);
    }

    @Operation(summary = "minimum")
    @PostMapping("min")
    public void min(@RequestBody() int[] numbers) {
        this.kafkaProducerService.minValues(numbers);
    }
    
    @Operation(summary = "maximum")
    @PostMapping("max")
    public void max(@RequestBody() int[] numbers) {
        this.kafkaProducerService.maxValues(numbers);
    }
}
