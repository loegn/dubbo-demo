package com.example.dubbo.annotation.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.dubbo.service.DemoService;
import org.springframework.context.annotation.Primary;

//@Service(registry = "registry1")
@Service
@Primary
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello() {
        return "this response is from annotation";
    }
}
