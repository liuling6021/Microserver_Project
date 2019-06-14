
package com.hand.feign.Interf;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @Title:
 * @Description:
 * @Author:liuling
 * @Date:2019-06-12 15:18
 */

@FeignClient(value="compute-service",fallback = ComputeClientHystrix.class)
public interface ComputeClient {

    @RequestMapping(value = "/testBalance", method = RequestMethod.GET)
    String testBalance();
}

