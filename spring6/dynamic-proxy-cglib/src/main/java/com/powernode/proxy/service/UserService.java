package com.powernode.proxy.service;

/**
 * @date 2022/11/4&0:02
 *  CGLIB既可以代理接口，又可以代理类。底层采用继承的方式实现。所以被代理的目标类不能使用final修饰。
 */
public class UserService {//目标类
    //目标方法
    public boolean login(String username,String password){
        System.out.println("系统正在验证身份");
        if (username.equals("admin")&&password.equals("123456")){
            return true;
        }
        return false;
    }
    //目标方法
    public void logout(){
        System.out.println("正在退出系统");
    }

}
