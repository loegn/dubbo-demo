package com.example.dubbo.provider.service.impl;

import com.example.dubbo.service.DemoService;

/**
 * @date : 2019/08/01
 * @author: liangenmao
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello() {
        return "Hello , response from provider: " + System.getenv("COMPUTERNAME");
    }
}
