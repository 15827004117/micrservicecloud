package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 功能描述:
 *
 * @作者: lj
 * @创建时间: 2019/4/17 17:19
 */
@SpringBootApplication
@EnableEurekaClient     //表示客户端
@EnableDiscoveryClient  //表示服务发现
@EnableCircuitBreaker   //对Hystrix熔断机制的支持
public class DeptProvider8001_Hystrix_App {

    public static void main(String[] args) {

        SpringApplication.run(DeptProvider8001_Hystrix_App.class,args);
    }
}