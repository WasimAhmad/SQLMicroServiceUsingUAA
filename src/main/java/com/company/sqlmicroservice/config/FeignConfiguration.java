package com.company.sqlmicroservice.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.company.sqlmicroservice")
public class FeignConfiguration {

}
