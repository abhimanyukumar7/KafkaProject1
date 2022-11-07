package com.kafka.springboot.KafkaProducer.controller;

import com.kafka.springboot.KafkaProducer.modal.User;
import com.kafka.springboot.KafkaProducer.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("producer")
public class ProducerController {
    @Autowired
    private ProducerService producerService;

    @PostMapping("json")
    public ResponseEntity<String> publishJsonMessage(@RequestBody User user){
        producerService.sendJsonMessage(user);
        return new ResponseEntity<>("Published Json Message Successfully...", HttpStatus.OK);
    }

    @PostMapping("string/{message}")
    public ResponseEntity<String> publishJsonMessage(@PathVariable String message){
        producerService.sendStringMessage(message);
        return new ResponseEntity<>("Published String Message Successfully...", HttpStatus.OK);
    }
}
