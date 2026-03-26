package com.chibuike.fintechguard.Config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    @Bean
    public Queue myQueue(){

        // the durable is set to true such that even when RabbitMQ restarts the Queue remains
        return new Queue("app-queue", true);
    }
}
