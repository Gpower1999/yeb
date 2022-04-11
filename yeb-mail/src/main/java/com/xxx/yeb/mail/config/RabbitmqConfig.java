package com.xxx.yeb.mail.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * TODO
 *
 * @author Gpower
 * @date 2022/4/10 16:29
 */
@Configuration
public class RabbitmqConfig {
    private static final String QUEUE_A = "mail.welcome";

    @Bean
    public Queue queueA(){
        return new Queue(QUEUE_A);
    }
}
