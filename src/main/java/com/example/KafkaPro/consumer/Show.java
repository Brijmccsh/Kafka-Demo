package com.example.KafkaPro.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Show {
    @KafkaListener(topics = "TrainEvent", groupId = "G_id")
    public void consume(String msg)
    {
        System.out.println("communique = " + msg);
    }

}

