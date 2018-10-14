package com.smartzhe.demo;

/**
 * Created by luohuahua on 18/8/26.
 */

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.smartzhe.demo.domain.dao")
public class Application {

    public static void main(final String[] args) {
       /* try (ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args)) {
            //applicationContext.getBean(DemoService.class).demo();
        }*/
        SpringApplication.run(Application.class, args);
    }
}

