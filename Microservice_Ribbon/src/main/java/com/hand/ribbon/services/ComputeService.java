/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 */

package com.hand.ribbon.services;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Title:
 * @Description:
 * @Author:liuling
 * @Date:2019-06-14 11:35
 */
@Service
public class ComputeService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "testBalancedFallback")
    public String testBalanced(){
        return restTemplate.getForEntity("http://compute-service/testBalance",String.class).getBody();
    }

    public String testBalancedFallback(){
        return "Error";
    }
}
