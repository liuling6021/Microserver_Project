/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 */

package com.hand.feign.Interf;

import org.springframework.stereotype.Component;

/**
 * @Title:
 * @Description:
 * @Author:liuling
 * @Date:2019-06-14 14:53
 */
@Component
public class ComputeClientHystrix implements ComputeClient{
    @Override
    public String testBalance() {
        return "Error";
    }
}
