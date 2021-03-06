package com.rick.framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Userserver1Application {

    public static void main(String[] args) {
        SpringApplication.run(Userserver1Application.class, args);
    }
}
