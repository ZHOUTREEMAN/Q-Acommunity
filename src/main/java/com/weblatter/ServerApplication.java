package com.weblatter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.weblatter.dao")
public class ServerApplication {
    public static void main(String []args){
        SpringApplication.run(ServerApplication.class, args);
    }
}
