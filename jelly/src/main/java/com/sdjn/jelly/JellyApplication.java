package com.sdjn.jelly;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan
@MapperScan("com.sdjn.jelly.modular.system.dao")
public class JellyApplication {

    public static void main(String[] args) {
        SpringApplication.run(JellyApplication.class, args);
    }

}
