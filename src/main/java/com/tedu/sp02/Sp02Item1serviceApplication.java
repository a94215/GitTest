package com.tedu.sp02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Sp02Item1serviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Sp02Item1serviceApplication.class, args);
    }

}
