package com.example.KafkaPro.kafkacontroller;


import com.example.KafkaPro.model.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProController {


    @Autowired
    KafkaTemplate<String, Info> kafkaTemplate;


    private static final String TOPIC = "TrainEvent";


    @PostMapping("/eventstatus")
    public String eventConfirmation(@RequestBody Info info)
    {
        kafkaTemplate.send(TOPIC, info);
        return "Event created Successfully!";
    }





}
