package com.bjpowernode.spring6.dao.impl;

import com.bjpowernode.spring6.dao.UserDao;

/**
 * @date 2022/10/27&17:43
 */
public class UserDaoImplForOracle implements UserDao {
    @Override
    public void deleteById() {
        System.out.println("Oracle数据库正在删除用户信息....");
    }
}
