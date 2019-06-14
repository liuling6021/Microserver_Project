package com.hand.computer1service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Computer1serviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Computer1serviceApplication.class, args);
    }

}
