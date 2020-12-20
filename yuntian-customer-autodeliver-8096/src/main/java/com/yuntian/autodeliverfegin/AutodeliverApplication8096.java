package com.yuntian.autodeliverfegin;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class AutodeliverApplication8096 {

    public static void main(String[] args) {
        SpringApplication.run(AutodeliverApplication8096.class, args);
    }


}
