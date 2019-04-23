package com.atguigu.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 功能描述: 部门表
 *
 * @作者: lj
 * @创建时间: 2019/4/17 14:32
 */
@Data
@SuppressWarnings("serial")
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {

    private Long deptno;  //主键
    private String dname; //部门名称
    private String db_source; //来自哪个数据库，微服务架构可以一个服务对应一个库，同一信息被存储到不同库

    public Dept(String dname) {
        super();
        this.dname = dname;
    }
}
