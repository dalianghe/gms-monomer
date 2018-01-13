package com.github.dalianghe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan(basePackages="com.github.dalianghe")
public class TestBootstrap {
    public static void main( String[] args ){
        SpringApplication.run(TestBootstrap.class , args);
    }
}
