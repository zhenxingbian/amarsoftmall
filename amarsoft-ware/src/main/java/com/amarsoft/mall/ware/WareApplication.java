package com.amarsoft.mall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zxbian
 * @version 1.0
 * @date 2022/1/6 17:26
 */
@SpringBootApplication
@MapperScan("com.amarsoft.mall.ware.dao")
public class WareApplication {
    public static void main(String[] args) {
        SpringApplication.run(WareApplication.class,args);
    }
}
