package com.example.myspb;

import com.example.myspb.event.MyEvent;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyspbApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyspbApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext applicationContext) {
        return args -> {
            MyEvent event = new MyEvent(this, "我已经注册账号");
            applicationContext.publishEvent(event);
        };
    }
}
