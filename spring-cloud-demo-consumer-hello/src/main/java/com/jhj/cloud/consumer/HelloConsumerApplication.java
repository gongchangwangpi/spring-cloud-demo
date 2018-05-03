package com.jhj.cloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author zhangbo
 */
@EnableFeignClients
@EnableCircuitBreaker // 开启断路器
@EnableDiscoveryClient
@SpringBootApplication
public class HelloConsumerApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(HelloConsumerApplication.class, args);
    }
    
}
