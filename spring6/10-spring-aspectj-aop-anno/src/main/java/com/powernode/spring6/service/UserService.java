package com.powernode.spring6.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @date 2022/11/4&20:13
 */@Service("userService")
public class UserService {//目标类
    public void login(){//目标方法
        System.out.println("系统正在进行身份认证");
    }

    public void logout(){
        System.out.println("系统正在退出..");
    }
}
