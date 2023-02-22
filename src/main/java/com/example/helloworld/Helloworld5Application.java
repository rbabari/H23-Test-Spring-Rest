package com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.helloworld.*"})
public class Helloworld5Application {

    public static void main(String[] args) {
        SpringApplication.run(Helloworld5Application.class, args);
    }

}
