package com.zq.serviceprovider11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Serviceprovider11Application {

    public static void main(String[] args) {
        SpringApplication.run(Serviceprovider11Application.class, args);
    }

}
