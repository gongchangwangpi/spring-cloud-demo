package com.jhj.cloud.provider.partner;

import com.jhj.cloud.provider.partner.dto.PartnerDto;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhangbo
 */
@Slf4j
@RestController
public class PartnerController {
    
    @GetMapping(value = "/{appId}")
    public PartnerDto getByAppId(@PathVariable("appId") String appId) {
        log.info("appId: {}", appId);
        PartnerDto dto = new PartnerDto();
        dto.setAppId("1234567890abcdef");
        dto.setAppKey("1234567890abcdef");
        dto.setAppSecret("1234567890abcdef");
        dto.setLinkman("张三");
        dto.setChannelCode((byte) 1);
        dto.setStatus(true);
        return dto;
    }
    
    @PostMapping(value = "/quote/getResult")
    public PartnerDto quote(@RequestBody String body) {
        log.info("body: {}", body);
//        log.info("attr: {}", attr);
        PartnerDto dto = new PartnerDto();
        dto.setAppId("1234567890abcdef");
        dto.setAppKey("1234567890abcdef");
        dto.setAppSecret("1234567890abcdef");
        dto.setLinkman("张三");
        dto.setChannelCode((byte) 1);
        dto.setStatus(true);
        return dto;
    }
}
