package com.bjpowernode.spring6.service;

import com.bjpowernode.spring6.dao.UserDao;
import com.bjpowernode.spring6.dao.VipDao;

/**
 * @date 2022/10/28&19:42
 */
public class CustomerService_constructor {
    private UserDao userDao;
    private VipDao vipDao;
    //构造方法注入

    public CustomerService_constructor() {
    }

    public CustomerService_constructor(UserDao userDao, VipDao vipDao) {
        this.userDao = userDao;
        this.vipDao = vipDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setVipDao(VipDao vipDao) {
        this.vipDao = vipDao;
    }

    public void save(){
        userDao.insert();
        vipDao.insert();
    }
}
