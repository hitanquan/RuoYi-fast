package com.ruoyi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
//@ComponentScan("com.ruoyi.user.mapper")
public class MyRuoYiApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyRuoYiApplication.class, args);
    }
}
