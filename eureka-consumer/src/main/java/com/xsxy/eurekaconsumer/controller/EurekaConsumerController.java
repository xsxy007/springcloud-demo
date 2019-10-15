package com.xsxy.eurekaconsumer.controller;

import com.netflix.appinfo.ApplicationInfoManager;
import com.netflix.discovery.StatusChangeEvent;
import com.netflix.discovery.TimedSupervisorTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import sun.plugin2.main.server.HeartbeatThread;

import java.util.concurrent.TimeUnit;

@RestController
public class EurekaConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer")
    public String consumer(@RequestParam String aaa) {

        return restTemplate.getForObject("http://EUREKA-PROVIDER/provider?aaa=" + aaa, String.class);

    }


}
