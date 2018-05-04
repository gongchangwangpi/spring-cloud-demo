package com.jhj.cloud.provider.hello;

/**
 * @author zhangbo
 */

import java.util.concurrent.TimeUnit;

import com.jhj.cloud.commons.dto.RestResultDto;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/hello")
public class HelloController {
    
    @GetMapping(value = "/get")
    public RestResultDto hello(String body) {
        log.info("---------- hello get: {}", body);
        return RestResultDto.succeed();
    }
    
    @PostMapping(value = "/post")
    public RestResultDto post(String body) throws InterruptedException {
        log.info("---------- hello post: {}", body);
        TimeUnit.SECONDS.sleep(2);
        return RestResultDto.succeed();
    }
    
}
