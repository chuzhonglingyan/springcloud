package com.yuntian;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EntityScan("com.yuntian.pojo")
//@EnableEurekaClient  // 开启Eureka Client（Eureka独有）
@EnableDiscoveryClient // 开启注册中心客户端 （通用型注解，比如注册到Eureka、Nacos等） 从SpringCloud的Edgware版本开始，不加注解也ok，但是建议大家加上
public class YuntianResumeApplication {

    public static void main(String[] args) {
        SpringApplication.run(YuntianResumeApplication.class,args);
    }

}
