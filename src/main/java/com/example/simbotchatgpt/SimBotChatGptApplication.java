package com.example.simbotchatgpt;

import love.forte.simboot.spring.autoconfigure.EnableSimbot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableSimbot
@SpringBootApplication
public class SimBotChatGptApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimBotChatGptApplication.class, args);
    }

}
