package com.amarsoft.mall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zxbian
 * @version 1.0
 * @date 2022/1/6 13:59
 */
@MapperScan("com.amarsoft.mall.product.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class ProductMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductMainApplication.class, args);
    }
}
