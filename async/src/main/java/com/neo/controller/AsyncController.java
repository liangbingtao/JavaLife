package com.neo.controller;

import com.neo.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author : neo
 * @Date 2021/7/24 10:04
 * @Description : TODO
 */
@Controller
public class AsyncController {

    @Autowired
    private AsyncService asyncService;

    @GetMapping("/")
    @ResponseBody
    public String hello() {
        asyncService.hello();
        return "ok";
    }
}
