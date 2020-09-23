package com.zq.eureka_support;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @desc
 * @author zhouqi
 * @data 2020/7/29
 */
@SpringBootApplication
@EnableEurekaServer//代表自己是一个服务提供方
public class EurekaSupportApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaSupportApplication.class, args);
    }
}
