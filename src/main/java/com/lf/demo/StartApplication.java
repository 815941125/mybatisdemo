package com.lf.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author linfei
 * @version 1.0
 * @date 2019/5/30
 * @desc
 * @see
 * @since 1.0
 */
@SpringBootApplication
@MapperScan("com.lf.demo.dao")
public class StartApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }
}
