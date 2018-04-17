package com.jhj.cloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zhangbo
 */
@EnableEurekaClient
@SpringBootApplication
public class HelloProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloProviderApplication.class, args);
    }
    
}
