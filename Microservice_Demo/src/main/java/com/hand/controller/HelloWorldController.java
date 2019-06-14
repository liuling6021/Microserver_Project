/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 */

package com.hand.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title:
 * @Description:
 * @Author:liuling
 * @Date:2019-06-06 16:48
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
}
