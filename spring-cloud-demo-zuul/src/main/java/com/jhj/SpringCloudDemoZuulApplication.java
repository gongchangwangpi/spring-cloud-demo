package com.jhj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class SpringCloudDemoZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDemoZuulApplication.class, args);
	}

}
