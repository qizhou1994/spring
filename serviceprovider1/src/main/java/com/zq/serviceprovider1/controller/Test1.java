package com.zq.serviceprovider1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhouqi
 * @desc
 * @data 2020/8/2
 */
@RestController
public class Test1 {

    @RequestMapping("service1")
    public String test1(){
        return "服务provider";
    }
}
