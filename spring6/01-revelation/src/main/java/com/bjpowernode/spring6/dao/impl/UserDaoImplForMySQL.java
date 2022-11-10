package com.bjpowernode.spring6.dao.impl;

import com.bjpowernode.spring6.dao.UserDao;

/**
 * @date 2022/10/27&17:25
 */
public class UserDaoImplForMySQL implements UserDao {
    @Override
    public void deleteById() {
        System.out.println("MySQL数据库正在删除用户信息..");
    }
}
