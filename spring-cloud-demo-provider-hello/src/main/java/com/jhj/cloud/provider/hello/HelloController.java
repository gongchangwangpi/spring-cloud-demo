package com.jhj.cloud.provider.hello;

/**
 * @author zhangbo
 */

import com.jhj.cloud.commons.dto.RestResultDto;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {
    
    @GetMapping(value = "/hello", produces = "application/json;charset=UTF-8")
    public RestResultDto hello() {
        log.info("---------- hello ----------");
        return RestResultDto.succeed();
    }
    
}
