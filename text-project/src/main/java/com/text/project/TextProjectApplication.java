package com.text.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** 
* @Description: SpringBoot的启动类
* @Author: qxf
* @Date: 2019/5/26 5:39 PM
*/ 
@SpringBootApplication
@MapperScan("com.text.project.dao")
public class TextProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(TextProjectApplication.class, args);
    }

}
