package com.example.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.dubbo.service.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @date : 2019/08/01
 * @author: liangenmao
 */
@RestController
public class TestController {
    @Resource
    private DemoService demoService;

    @RequestMapping("/test")
    public String test(){
        return demoService.sayHello();
    }

}
