package com.example.dubbo.consumer.service.impl;

import com.example.dubbo.service.SecondService;

/**
 * @date : 2019/08/01
 * @author: liangenmao
 */
public class SecondServiceImpl implements SecondService {
    @Override
    public String secondHello() {
        return "SecondHello" + System.getenv("COMPUTERNAME");
    }
}
