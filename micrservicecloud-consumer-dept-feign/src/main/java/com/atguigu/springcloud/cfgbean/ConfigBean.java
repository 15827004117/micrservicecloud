package com.atguigu.springcloud.cfgbean;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 功能描述:
 *
 * @作者: lj
 * @创建时间: 2019/4/18 10:16
 */
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced       //Spring Cloud Ribbon 基于Netflix Ribbon实现的一套客户端 负载均衡
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
