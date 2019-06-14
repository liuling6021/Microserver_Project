/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 */


package com.hand.feign.controller;


import com.hand.feign.Interf.ComputeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title:
 * @Description:
 * @Author:liuling
 * @Date:2019-06-12 15:22
 */

@RestController
public class ConsumerController {

    @Autowired
    ComputeClient computerClient;

   @RequestMapping(value = "/testBalance",method = RequestMethod.GET)
    public String testBalance(){
        return computerClient.testBalance();
    }

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "Hello";
    }
}

