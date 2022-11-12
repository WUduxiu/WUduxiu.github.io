package com.bjpowernode.spring6.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @date 2022/10/28&19:32
 */
public class VipDao {
    //定义常量 log4j2日志框架
    private static final Logger logger = LoggerFactory.getLogger(UserDao.class);

    public void insert(){
        //使用log4j2日志框架
        logger.info("数据库正在保存Vip的用户信息");
    }
}
