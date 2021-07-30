package com.neo.excelutil;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.neo.excelutil.dao")
public class ExcelUtilApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExcelUtilApplication.class, args);
    }

}
