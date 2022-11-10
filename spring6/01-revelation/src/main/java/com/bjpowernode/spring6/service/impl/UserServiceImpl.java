package com.bjpowernode.spring6.service.impl;

import com.bjpowernode.spring6.dao.UserDao;
import com.bjpowernode.spring6.dao.impl.UserDaoImplForMySQL;
import com.bjpowernode.spring6.dao.impl.UserDaoImplForOracle;
import com.bjpowernode.spring6.service.UserService;

/**
 * @date 2022/10/27&17:26
 */
public class UserServiceImpl implements UserService {
    /*
    业务层只是实现处理用户信息的业务逻辑
    真正的数据修改还是在dao层进行
    所以需要在service中调用 dao层
     */
    //定义成员变量    userDao接口
   // private UserDao userDao = new UserDaoImplForMySQL(); 修改数据类型
    //private UserDao userDao = new UserDaoImplForOracle();
    private  UserDao userDao;
    @Override
    public void deleteUser() {
        //处理业务逻辑
        //调用dao层中的实现方法(增删改查的方法)
        userDao.deleteById();
    }
}
