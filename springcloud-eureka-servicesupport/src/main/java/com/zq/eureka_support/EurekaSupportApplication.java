package com.zq.eureka_support;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @desc
 * @author zhouqi
 * @data 2020/7/29
 */
@SpringBootApplication
@EnableDiscoveryClient//代表自己是一个服务提供方
public class EurekaSupportApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaSupportApplication.class, args);
    }
}
