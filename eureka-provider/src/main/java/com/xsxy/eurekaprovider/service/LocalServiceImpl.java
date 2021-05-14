package com.xsxy.eurekaprovider.service;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LocalServiceImpl implements LocalService {

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    LcnService lcnService;

    @Override
    @Transactional(rollbackFor = Exception.class)
    @LcnTransaction
    public int localTestlcn() {
        System.out.println("provider   ----- start");
        jdbcTemplate.update("insert into bug_log values(1, '2020-01-01')");

        lcnService.testConsumerLvn();
        return 0;
    }
}
