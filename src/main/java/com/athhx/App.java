package com.athhx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Hou Huaxin
 * @date 2023-12-27 16:05
 */
@SpringBootApplication
@MapperScan("com.athhx.mapper")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
