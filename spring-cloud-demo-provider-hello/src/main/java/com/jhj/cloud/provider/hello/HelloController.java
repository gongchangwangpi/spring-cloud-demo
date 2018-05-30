package com.jhj.cloud.provider.hello;

/**
 * @author zhangbo
 */

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jhj.cloud.commons.dto.RestResultDto;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

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
    public RestResultDto post(@RequestBody String body, HttpServletRequest request, HttpServletResponse response) throws InterruptedException {
        log.info("---------- hello post: {}", body);
//        TimeUnit.SECONDS.sleep(2);
//        response.setStatus(HttpStatus.BAD_GATEWAY.value());
        return RestResultDto.succeed();
    }
    
}
