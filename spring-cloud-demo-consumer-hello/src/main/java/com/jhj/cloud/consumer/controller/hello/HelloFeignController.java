package com.jhj.cloud.consumer.controller.hello;

import com.jhj.cloud.commons.dto.RestResultDto;
import com.jhj.cloud.consumer.service.HelloService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangbo
 */
@Slf4j
@RestController
public class HelloFeignController {
    
    @Autowired
    private HelloService helloService;
    
    @RequestMapping(value = "/feign/hello/{body}")
    public RestResultDto hello(@PathVariable String body) {
        log.info("---->>> get {}", body);
        return helloService.get(body);
    }
    
    @RequestMapping(value = "/feign/hello/post")
    public RestResultDto helloPost(String body) {
        log.info("---->>> post {}", body);
        return helloService.post("post: " + body);
    }
    
    
}
