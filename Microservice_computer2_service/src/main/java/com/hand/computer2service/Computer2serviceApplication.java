package com.hand.computer2service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Computer2serviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Computer2serviceApplication.class, args);
    }

}
