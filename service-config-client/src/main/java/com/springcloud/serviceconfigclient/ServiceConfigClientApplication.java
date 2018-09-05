package com.springcloud.serviceconfigclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceConfigClientApplication.class, args);
    }
}
