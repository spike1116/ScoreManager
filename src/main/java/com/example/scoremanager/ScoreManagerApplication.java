package com.example.scoremanager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com/example/scoremanager/mapper")
public class ScoreManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScoreManagerApplication.class, args);
    }

}
