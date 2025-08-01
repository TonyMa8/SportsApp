package com.sports.sports;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQListener {
    @RabbitListener(queues = "scoreQueue")
    public void receive(String message){
        System.out.println("Received message: " + message);
        //Add implementation to send info to websockets
    }
}
