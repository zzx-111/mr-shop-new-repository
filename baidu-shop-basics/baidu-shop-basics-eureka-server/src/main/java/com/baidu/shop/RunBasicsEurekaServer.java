package com.baidu.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 2 * @ClassName RunBasicsEurekaServer
 * 3 * @Description: TODO
 * 4 * @Author zzx
 * 5 * @Date 2021/1/20
 * 6 * @Version V1.0
 * 7
 **/
@SpringBootApplication
@EnableEurekaServer
public class RunBasicsEurekaServer {
    public static void main(String[] args) {
        SpringApplication.run(RunBasicsEurekaServer.class);
    }
}
