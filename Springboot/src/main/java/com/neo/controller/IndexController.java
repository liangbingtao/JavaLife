package com.neo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * @Author : neo
 * @Date 2021/7/20 10:54
 * @Description : TODO
 */

//在templates目录下的所有页面，只能通过controller来跳转
@Controller
public class IndexController {

/*    @RequestMapping({"/","index.html"})
    public String index(Model model) {
        model.addAttribute("msg","<h1>hello,Thymeleaf</h1>");
        model.addAttribute("users", Arrays.asList("张三","李四","王五"));
       return "index";
    }*/
}
