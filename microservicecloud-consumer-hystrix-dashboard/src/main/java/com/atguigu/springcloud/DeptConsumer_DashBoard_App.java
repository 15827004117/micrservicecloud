package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * 功能描述:
 *
 * @作者: lj
 * @创建时间: 2019/4/22 17:01
 */
@SpringBootApplication
@EnableHystrixDashboard     //开启Hystrix服务监控
public class DeptConsumer_DashBoard_App {

    public static void main(String[] args) {

        SpringApplication.run(DeptConsumer_DashBoard_App.class, args);
    }
}
