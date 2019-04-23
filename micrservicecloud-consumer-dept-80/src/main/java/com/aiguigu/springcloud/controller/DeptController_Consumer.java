package com.aiguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Dept;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * 功能描述:
 *
 * @作者: lj
 * @创建时间: 2019/4/18 10:40
 */
@Slf4j
@RestController
public class DeptController_Consumer {

    //private static final String REST_URL_PREFIX = "http://localhost:8001";  //访问前缀

    private static final String REST_URL_PREFIX = "http://MICRSERVICECLOUD-DEPT";  //访问前缀

    @Autowired
    private RestTemplate template;

    @PostMapping("/consumer/add")
    public boolean add(Dept dept) {
        return template.postForObject(REST_URL_PREFIX + "/dept/add", dept, boolean.class);
    }

    @GetMapping("/consumer/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return template.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class);
    }

    @SuppressWarnings("unchecked")      //不检查
    @GetMapping("/consumer/list")
    public List<Dept> list() {
        return template.getForObject(REST_URL_PREFIX + "/dept/list",List.class);
    }

    //client
    @GetMapping("/consumer/discovery")
    public Object discovery() {

        return template.getForObject(REST_URL_PREFIX + "/dept/discovery", Object.class);

    }
}
