package com.bjpowernode.spring6.service;

import com.bjpowernode.spring6.dao.UserDao;
import com.bjpowernode.spring6.dao.VipDao;

/**
 * @date 2022/10/28&17:50
 */
public class UserService_set {
    private UserDao userDao;
    private VipDao vipDao;
    //定义set方法
    //Spring容器会调用这个set方法，来给userDao属性赋值
    //定义set方法 必须保证这个方法名的前三个字母必须是set
    //set注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setVipDao(VipDao vipDao) {
        this.vipDao = vipDao;
    }

    public void saveUser() {
        System.out.println(userDao);
        userDao.insert();
    }

    public void saveVip(){
        vipDao.insert();
    }
}
