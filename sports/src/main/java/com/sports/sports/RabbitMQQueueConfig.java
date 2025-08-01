package com.sports.sports;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;


// Queue definition, durable:flase so that it woin't be durable aka queue and its data will be lost if RabbitMQ server restarts
public class RabbitMQQueueConfig {
    
    @Bean(name="queue")
    public Queue scoreQueue() {
        return new Queue("scoreQueue", false);
    }
}
