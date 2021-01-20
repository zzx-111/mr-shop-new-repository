package com.baidu.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 2 * @ClassName RunShopServiceXxx
 * 3 * @Description: TODO
 * 4 * @Author zzx
 * 5 * @Date 2021/1/20
 * 6 * @Version V1.0
 * 7
 **/
@SpringBootApplication
@EnableFeignClients
@MapperScan("com.baidu.shop.mapper")
public class RunShopServiceXxx {
    public static void main(String[] args) {
        SpringApplication.run(RunShopServiceXxx.class);
    }
}
