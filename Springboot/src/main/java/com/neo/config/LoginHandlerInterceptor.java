package com.neo.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Author : neo
 * @Date 2021/7/21 10:34
 * @Description : TODO
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        //登录成功之后应该有用户的session
        Object loginUser = request.getSession().getAttribute("loginUser");
        if (loginUser==null){
            request.setAttribute("msg","没有权限，请先登录！");
            request.getRequestDispatcher("/index.html").forward(request,response);
            return false;
        }else {
            return true;
        }
    }
}
