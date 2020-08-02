package com.zq.eureka_support.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhouqi
 * @desc
 * @data 2020/7/29
 */
@RestController
@RequestMapping("/hello")
public class Controller {
    @RequestMapping("/world")
    public String helloword(String s){
        System.out.println("输出的数值："+s);
        return "传入的值为："+s;
    }
}
