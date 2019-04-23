package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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
public class DeptProvider8002_App {

    public static void main(String[] args) {

        SpringApplication.run(DeptProvider8002_App.class,args);
    }
}
