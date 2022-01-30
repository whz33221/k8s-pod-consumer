package com.whz.k8spod.swaggertest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SwaggerTestApplication {

    public static void main(String[] args) {


        SpringApplication.run(SwaggerTestApplication.class, args);
    }

}
