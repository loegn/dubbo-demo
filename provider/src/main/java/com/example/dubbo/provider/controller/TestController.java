package com.example.dubbo.provider.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.dubbo.service.SecondService;
import org.springframework.beans.factory.annotation.Autowired;
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
    private SecondService secondService;

    @RequestMapping("/test")
    public String test(){
        return secondService.secondHello();
    }
}
