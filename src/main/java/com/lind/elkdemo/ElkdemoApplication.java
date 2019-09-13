package com.lind.elkdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ElkdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElkdemoApplication.class, args);
    }

    @GetMapping("/")
    public String hello() {
        Logger apmInfoLogger = LoggerFactory.getLogger("ElkdemoApplication");
        apmInfoLogger.info("hello world!");
        return "hello world";
    }

}
