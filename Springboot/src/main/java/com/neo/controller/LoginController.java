package com.neo.controller;

import org.apache.logging.log4j.message.ReusableMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * @Author : neo
 * @Date 2021/7/21 10:03
 * @Description : TODO
 */

@Controller
public class LoginController {

    @RequestMapping("/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Model model, HttpSession session) {
        //具体的业务
        if (!StringUtils.isEmpty(username) && "123123".equals(password)) {
            session.setAttribute("loginUser", username);
            return "dashboard";
        } else {
            //告诉用户你登录失败了
            model.addAttribute("msg", "用户名或者密码错误");
            return "index";
        }

    }
}
