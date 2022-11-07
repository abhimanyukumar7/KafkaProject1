package com.kafka.springboot.KafkaProducer.service;

import com.kafka.springboot.KafkaProducer.modal.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {
    @Autowired
    private KafkaTemplate<String, User> jsonTemplate;

    private static final String jsonTopic = "jsonPOC";

    @Autowired
    private KafkaTemplate<String, String> generalTemplate;

    private static final String generalTopic = "generalPOC";

    public void sendStringMessage(String name) {
        generalTemplate.send(generalTopic, name);
    }

    public void sendJsonMessage(User user) {
        jsonTemplate.send(jsonTopic, user);
    }
}
