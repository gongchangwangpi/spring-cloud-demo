package com.jhj.cloud.consumer.service;

import com.jhj.cloud.commons.dto.RestResultDto;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhangbo
 */
@FeignClient(value = "hello-service")
public interface HelloService {
    
    @GetMapping(value = "/hello/get")
    public RestResultDto get(@RequestParam(value = "body") String body);
    
    @PostMapping(value = "/hello/post")
    public RestResultDto post(String body);
    
}
