package com.zq.filesystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class FilesystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(FilesystemApplication.class, args);
    }

}
