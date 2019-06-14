/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 */

package com.hand.computer2service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

/**
 * @Title:
 * @Description:
 * @Author:liuling
 * @Date:2019-06-11 15:31
 */
@RestController
public class ComputerController {

    private final Logger logger = Logger.getLogger(getClass().getName());

    @Autowired
    private Registration registration; // 服务注册

    @Autowired
    private DiscoveryClient client; // 服务发现客户端


    @RequestMapping(value = "/testBalance", method = RequestMethod.GET)
    public String testBalance() {
        ServiceInstance instance = serviceInstance();
        String result = "/testBalance, host:port=" + instance.getUri()  + ", "
                + "service_id:" + instance.getServiceId();
        logger.info(result);
        return "From Service-A , " + result;
    }

    public ServiceInstance serviceInstance() {
        List<ServiceInstance> list = client.getInstances(registration.getServiceId());
        if (list != null && list.size() > 0) {
            for(ServiceInstance itm : list){
                if(itm.getPort() == 4444 || itm.getPort() == 3333)
                    return itm;
            }
        }
        return null;
    }

}

