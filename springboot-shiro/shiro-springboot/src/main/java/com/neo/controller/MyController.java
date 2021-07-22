package com.neo.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author : neo
 * @Date 2021/7/22 12:38
 * @Description : TODO
 */
@Controller
public class MyController {


    @RequestMapping({"/", "/index"})
    public String toIndex(Model model) {
        model.addAttribute("msg", "hello,Shiro");
        return "index";
    }


    @RequestMapping("/user/add")
    public String add() {
        return "user/add";
    }

    @RequestMapping("/user/update")
    public String update() {
        return "user/update";
    }

    @RequestMapping("/toLogin")
    public String toLogin() {
        return "login";
    }


    @RequestMapping("/login")
    public String login(String username, String password, Model model) {
        //获取当前的用户
        Subject subject = SecurityUtils.getSubject();
        //封装用户的登录数据
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        //执行登录的方法，如果没有异常就说明ok了
        try {
            subject.login(token);
            return "index";
        } catch (UnknownAccountException e) {       //用户名不存在
            model.addAttribute("msg", "用户名错误");
            return "login";
        } catch (IncorrectCredentialsException e) {   //密码错误
            model.addAttribute("msg", "密码错误");
            return "login";
        }
    }

    //未授权页面
    @RequestMapping("/noauth")
    @ResponseBody
    public String unauthorized(Model model) {
        return "未经授权，不能访问";
    }


}

