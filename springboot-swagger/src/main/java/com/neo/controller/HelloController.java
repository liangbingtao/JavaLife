package com.neo.controller;

import com.neo.pojo.User;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : neo
 * @Date 2021/7/23 10:44
 * @Description : TODO
 */

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return"hello";
    }

    //只要我们的接口中，返回值中存在实体类，他就会被扫描到Swagger中
    @PostMapping("/hello")
    public User user(){
        return new User();
    }

    @ApiOperation("Hello2控制类")
    @GetMapping("/hello2")
    public String hello2(@ApiParam("用户名") String name){
        return "hello"+name;
    }

    @ApiOperation("post测试类")
    @PostMapping("/postt")
    public String postt(@ApiParam("用户名") User user){
        return "hello"+user;
    }
}
