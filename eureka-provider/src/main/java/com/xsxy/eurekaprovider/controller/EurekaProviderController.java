package com.xsxy.eurekaprovider.controller;

import com.xsxy.eurekaprovider.service.LocalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class EurekaProviderController {

    @Autowired
    LocalService localService;

    @GetMapping("/provider")
    public String provider(@RequestParam String aaa) {
        return "eureka-provider-return" + aaa;
    }


    @GetMapping("testHeader")
    public String testHeader(HttpServletResponse response) {
        response.addHeader("Access-Control-Expose-Headers", "Name");
        response.addHeader("Name", "Name");

        return "aaa";
    }

    @GetMapping("testLvn")
    public String testLcn() {
        localService.localTestlcn();
        return "0;";
    }
}
