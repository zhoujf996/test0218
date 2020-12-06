package com.atguigu.test0218.demo0218;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.atguigu.test0218.demo0218.mapper")
public class DemoTest0218Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoTest0218Application.class, args);
    }

}
