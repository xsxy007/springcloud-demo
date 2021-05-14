package com.xsxy.eurekaconsumer.controller;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EurekaConsumerController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @GetMapping("/consumer")
    public String consumer(@RequestParam String aaa) {

        return restTemplate.getForObject("http://EUREKA-PROVIDER/provider?aaa=" + aaa, String.class);

    }

    @GetMapping("comsumer-lcn")
    @Transactional(rollbackFor = Exception.class)
    @LcnTransaction
    public String testConsumerLvn() {
        System.out.println("testConsumerLvn    --- consumer");
        jdbcTemplate.update("aaaa");
        return "1";
    }


}
