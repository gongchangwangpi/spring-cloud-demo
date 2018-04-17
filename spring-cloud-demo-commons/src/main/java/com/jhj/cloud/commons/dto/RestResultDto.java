package com.jhj.cloud.commons.dto;


import lombok.Getter;
import lombok.Setter;

/**
 * @author zhangbo
 */
@Getter
@Setter
public class RestResultDto {
    
    private int code;
    
    private String message;
    
    private long timestamp;
    
    private Object body;

    public RestResultDto() {
    }

    public RestResultDto(int code, String message) {
        this(code, message, null);
    }

    public RestResultDto(int code, String message, Object body) {
        this(code, message, System.currentTimeMillis(), body);
    }

    public RestResultDto(int code, String message, long timestamp, Object body) {
        this.code = code;
        this.message = message;
        this.timestamp = timestamp;
        this.body = body;
    }
    
    public static RestResultDto fail() {
        return new RestResultDto(500, "未知异常");
    }
    
    public static RestResultDto succeed() {
        return new RestResultDto(200, "成功");
    }
    
}
