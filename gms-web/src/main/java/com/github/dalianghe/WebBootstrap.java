package com.github.dalianghe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 应用启动入口
 *
 */
@SpringBootApplication
@ComponentScan(basePackages="com.github.dalianghe")
public class WebBootstrap {
    public static void main( String[] args ) {
        SpringApplication.run(WebBootstrap.class , args);
    }
}
