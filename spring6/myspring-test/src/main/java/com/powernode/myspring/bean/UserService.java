package com.powernode.myspring.bean;

/**
 * @date 2022/10/31&23:03
 */
public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void save(){
        userDao.insert();
    }
}
