package com.sports.sports;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQPublisher {

    @Autowired
    private AmqpTemplate rabbitMQTemplate;

    public void sendScore(String message){
        rabbitMQTemplate.convertAndSend("scoreQueue", message);
    }
}