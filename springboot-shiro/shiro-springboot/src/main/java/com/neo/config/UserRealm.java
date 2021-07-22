package com.neo.config;

import com.neo.pojo.User;
import com.neo.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/**
 * @Author : neo
 * @Date 2021/7/22 14:33
 * @Description : TODO
 */

//自定义的UserRealm
public class UserRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("执行了授权=》AuthorizationInfo");

        //授权
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        // info.addStringPermission("user:add");

        //拿到当前登录的这个对象
        Subject subject = SecurityUtils.getSubject();
        User currentUser = (User) subject.getPrincipal();   //拿到User对象
        //设置当前用户权限
        // info.addStringPermission(currentUser.getPerms());

        String[] split = currentUser.getPerms().split(",");
        Collection<String> collection = new ArrayList<>();
        for (int i = 0; i < split.length; i++) {
            collection.add(split[i]);
        }

        info.addStringPermissions(collection);

        return info;
    }

    //认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        System.out.println("执行了认证=》AuthenticationInfo");

        //用户名，密码，数据库中取
        // String name = "root";
        // String password = "123";


        UsernamePasswordToken userToken = (UsernamePasswordToken) token;

        //连接真实的数据库
        User user = userService.queryUserByName(userToken.getUsername());

        // if (!userToken.getUsername().equals(name)){
        //     return null;    //抛出异常 UnknownAccountException
        // }

        // Subject currentSubject = SecurityUtils.getSubject();
        // Session session = currentSubject.getSession();//这个不是cookie和session中的session
        // session.setAttribute(  "loginUser",user);

        if (user == null) { //没有这个人
            return null;    //抛出异常，前端给出提示 UnknownAccountException
        }

        //密码认证，Shiro做，加密了，如MD5、MD5盐值加密
        return new SimpleAuthenticationInfo(user, user.getPwd(), "");
    }
}
