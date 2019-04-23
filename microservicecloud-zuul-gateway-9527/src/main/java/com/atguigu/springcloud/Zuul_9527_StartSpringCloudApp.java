package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 功能描述:
 *
 * @作者: lj
 * @创建时间: 2019/4/23 10:10
 */
@SpringBootApplication
@EnableZuulProxy
public class Zuul_9527_StartSpringCloudApp {

    public static void main(String[] args) {

        SpringApplication.run(Zuul_9527_StartSpringCloudApp.class, args);
    }
}
