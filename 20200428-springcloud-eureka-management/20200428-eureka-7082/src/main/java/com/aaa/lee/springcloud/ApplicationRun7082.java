package com.aaa.lee.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Company AAA软件教育
 * @Author Seven Lee
 * @Date Create in 2020/4/28 17:08
 * @Description
 **/
@SpringBootApplication
@EnableEurekaServer
public class ApplicationRun7082 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun7082.class, args);
    }

}
