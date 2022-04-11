package com.xxx.yeb.mail;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Queue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

@Slf4j
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MailApplication {
    public static void main(String[] args) {
        SpringApplication.run(MailApplication.class, args);
    }

    // @Bean
    // public void queue() throws IOException, TimeoutException {
    //     Channel channel = createChannel();
    //     channel.queueDeclare("mail.welcome", true, false, false, null);
    //
    // }
    // public Channel createChannel() throws IOException, TimeoutException {
    //     ConnectionFactory factory = new ConnectionFactory();
    //     factory.setHost("121.4.145.102");
    //     factory.setUsername("admin");
    //     factory.setPassword("19990410zjp");
    //     Connection connection = factory.newConnection();
    //     Channel channel = connection.createChannel();
    //     return channel;
    // }
    @Bean
    public Queue queue(){
        return new Queue("mail.welcome");
    }
}
