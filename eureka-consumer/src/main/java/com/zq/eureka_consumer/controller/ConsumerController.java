package com.zq.eureka_consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhouqi
 * @desc
 * @data 2020/7/29
 */
@RestController
@RequestMapping("/hello")
public class ConsumerController {
    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/consumer")
    public String helloWorld() {
        System.out.println("consumer");
        //第一种调用方式
        //String forObject = new RestTemplate().getForObject("http://localhost:8071/hello/world?s=" + s, String.class);

        //第二种调用方式
        //根据服务名 获取服务列表 根据算法选取某个服务 并访问某个服务的网络位置。
//        ServiceInstance serviceInstance = loadBalancerClient.choose("EUREKA-SUPPORT-SERVICE");
//        String forObject = new RestTemplate().getForObject("http://"+serviceInstance.getHost()+":"+serviceInstance.getPort()+"/hello/world?s="+s,String.class);

//        第三种调用方式 需要restTemplate注入的方式
        String forObject = restTemplate.getForObject("http://EUREKA-PROVIDER1/service1", String.class);
        return forObject;
    }
}
