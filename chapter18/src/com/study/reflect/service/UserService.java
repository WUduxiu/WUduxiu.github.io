package com.study.reflect.service;

/**
 * @date 2022/10/23&14:56
 */
public class UserService {
    public boolean logIn(String username, String password) {
        if ("admin".equals(username) && "123456".equals(password)) {
            return true;
        }
        return false;
    }
    public void exit(){
        System.out.println("已经安全退出系统");
    }
}
