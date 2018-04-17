package com.jhj.cloud.consumer.hello;

import javax.annotation.Resource;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhangbo
 */
@Slf4j
@RestController
public class HelloController {
    
    @Resource
    private RestTemplate restTemplate;
    
    @HystrixCommand(fallbackMethod = "helloFallback")
    @GetMapping(value = "/consumer/hello")
    public String hello() {
        return restTemplate.getForEntity("http://HELLO-SERVICE/hello", String.class).getBody();
    }
    
    public String helloFallback() {
        return "hello-fallback";
    }
}
