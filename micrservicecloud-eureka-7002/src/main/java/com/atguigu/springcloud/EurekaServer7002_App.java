package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 功能描述:
 *
 * @作者: lj
 * @创建时间: 2019/4/18 12:26
 */
@SpringBootApplication
@EnableEurekaServer     //eureka服务端
public class EurekaServer7002_App {

    public static void main(String[] args) {

        SpringApplication.run(EurekaServer7002_App.class, args);
    }
}
