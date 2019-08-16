package com.example.dubbo.annotation.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.dubbo.annotation.utils.SpringUtils;
import com.example.dubbo.service.DemoService;
import com.example.dubbo.service.SecondService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Reference(check = false)
    private SecondService secondService;
    @Reference
    private DemoService demoService;
    @Autowired
    private DemoService demoService2;

    @RequestMapping("/test")
    public String test() {
        SpringUtils.getBean(DemoService.class);
        return secondService.secondHello();
    }
}
