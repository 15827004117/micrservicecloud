package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * 功能描述:
 *
 * @作者: lj
 * @创建时间: 2019/4/17 17:09
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    //根据id查询
    @GetMapping("/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Dept get(@PathVariable("id") Long id) {

        Dept dept = deptService.findById(id);
        if(dept == null) {
            throw new RuntimeException("该ID:" + id + "没有查询到对应信息!");
        }
        return dept;
    }

    public Dept processHystrix_Get(@PathVariable("id") Long id) {

        return new Dept().setDeptno(id).setDname("该ID：" + id + "没有没有对应的信息,null--@HystrixCommand")
                .setDb_source("没有响应的数据库信息");
    }

}
