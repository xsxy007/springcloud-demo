package com.xsxy.eurekaprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaProviderController {

    @GetMapping("/provider")
    public String provider(@RequestParam String aaa){
        return "eureka-provider-return" + aaa;
    }
}
