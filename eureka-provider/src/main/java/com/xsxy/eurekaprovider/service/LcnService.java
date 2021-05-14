package com.xsxy.eurekaprovider.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-consumer")
public interface LcnService {

    @GetMapping("comsumer-lcn")
    String testConsumerLvn();
}
