package com.neo.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @Author : neo
 * @Date 2021/7/21 22:22
 * @Description : TODO
 */

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    //链式编程
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //首页所有人可以访问，但功能页只有对应有权限的人才能访问
        //请求授权的规则
        http.authorizeRequests().antMatchers("/").permitAll()
                .antMatchers("/level1/**").hasRole("vip1")
                .antMatchers("/level2/**").hasRole("vip2")
                .antMatchers("/level3/**").hasRole("vip3");

        //没有权限默认会到登录页面,需要开启登录的页面
        // /login，可以自定义设置登录页面和登录失败页面
        http.formLogin().loginPage("/toLogin");

        //当登录页面和表单提交页面不一致时，可以使用“loginProcessingUrl("/login")”使用默认的接口接收表单参数进行登录，
        // 默认接口接收的用户名和密码为“username”和"password"，当不一致时，可以使用 usernameParameter("user").passwordParameter("pwd")
        //进行自定义设置
        // http.formLogin().loginPage("/toLogin").
        //         usernameParameter("user").passwordParameter("pwd").loginProcessingUrl("/login");


        //注销  开启了注销功能,可以清除cookies和session并可以定义退出后跳转到的路径
        http.logout().logoutSuccessUrl("/");


        //防止网站攻击   大多网站都是get传输，不安全，
        http.csrf().disable();  //csrf：跨站请求伪造，关闭这个功能防止跨站攻击

        //开启“记住我功能”,cookie 默认保存两周
        //也可以自定义接收前端参数
        http.rememberMe().rememberMeParameter("remember");
    }


    //认证的规则
    //There is no PasswordEncoder mapped for the id "null"  密码编码
    //在Spring security 5.0+ 新增了很多的加密方法
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder())
                .withUser("liang").password(new BCryptPasswordEncoder().encode("123")).roles("vip1", "vip2")
                .and().withUser("root").password(new BCryptPasswordEncoder().encode("123")).roles("vip1", "vip2", "vip3")
                .and().withUser("guest").password(new BCryptPasswordEncoder().encode("123")).roles("vip1");

    }
}
