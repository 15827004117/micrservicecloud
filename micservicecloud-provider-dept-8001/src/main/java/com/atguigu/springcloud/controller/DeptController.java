package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 功能描述:
 *
 * @作者: lj
 * @创建时间: 2019/4/17 17:09
 */
@Slf4j
@RestController()
public class DeptController {

    @Autowired
    private DeptService deptService;
    @Autowired
    private DiscoveryClient client;

    //添加
    @PostMapping("/dept/add")
    public boolean add(@RequestBody Dept dept) {
            return deptService.addDept(dept);
    }

    //根据id查询
    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return deptService.findById(id);
    }

    //查询全部
    @GetMapping("/dept/list")
    public List<Dept> list() {
        return deptService.findAll();
    }

    //client
    @GetMapping("/dept/discovery")
    public Object discovery() {
        List<String> list = client.getServices();
        log.info("---------------" + list + "---------------");

        List<ServiceInstance> instancelist = client.getInstances("MICRSERVICECLOUD-DEPT");
        instancelist.forEach((ilist) -> System.out.println(ilist.getServiceId() + "\t"
                + ilist.getHost() + "\t"
                + ilist.getPort() + "\t"
                + ilist.getUri()  + "\t"));

        return this.client;

    }
}
