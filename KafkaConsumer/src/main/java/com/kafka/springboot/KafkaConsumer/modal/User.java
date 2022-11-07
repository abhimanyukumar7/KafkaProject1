package com.kafka.springboot.KafkaConsumer.modal;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {
    private String name;
    private String location;
    private int salary;
}
