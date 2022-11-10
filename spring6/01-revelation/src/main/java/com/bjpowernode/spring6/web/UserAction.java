package com.bjpowernode.spring6.web;

import com.bjpowernode.spring6.service.UserService;
import com.bjpowernode.spring6.service.impl.UserServiceImpl;


/**
 * @date 2022/10/27&17:23
 *  表现层
 */
public class UserAction {
    //表示层(web)调用业务层(service)  业务层调用持久层(dao)
    //定义成员变量  userService接口
    //private UserService userService = new UserServiceImpl();
    //使用控制反转 定义成员变量
    private UserService userService;
    /*
    删除用户信息的请求
     */
    public void deleteRequest(){
        userService.deleteUser();
    }

}
