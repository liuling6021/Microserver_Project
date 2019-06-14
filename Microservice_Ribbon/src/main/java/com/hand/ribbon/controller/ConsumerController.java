/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 */

package com.hand.ribbon.controller;

import com.hand.ribbon.services.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Title:
 * @Description:
 * @Author:liuling
 * @Date:2019-06-11 16:34
 */
@RestController
public class ConsumerController {

    //测试Ribbon的负载均衡功能
   /* @Autowired
    RestTemplate restTemplate;
    @RequestMapping(value = "/testBalanced", method = RequestMethod.GET)
    public String testBalanced() {
        return restTemplate.getForEntity("http://compute-service/testBalance", String.class).getBody();
    }*/

   //测试断路器功能
    @Autowired
    private ComputeService computeService;
    @RequestMapping(value = "/testBalanced", method = RequestMethod.GET)
    public String testBalanced() {
        return computeService.testBalanced();
    }
}