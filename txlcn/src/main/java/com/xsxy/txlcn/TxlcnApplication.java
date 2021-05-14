package com.xsxy.txlcn;

import com.codingapi.txlcn.tm.TMApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@EnableDiscoveryClient
public class TxlcnApplication extends TMApplication{

    public static void main(String[] args) {
        SpringApplication.run(TxlcnApplication.class, args);
    }

}
