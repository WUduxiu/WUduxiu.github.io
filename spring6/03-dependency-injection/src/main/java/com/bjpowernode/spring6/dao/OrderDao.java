package com.bjpowernode.spring6.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @date 2022/10/28&20:18
 */
public class OrderDao {
    private final static Logger logger = LoggerFactory.getLogger(OrderDao.class);

    public void insert(){
        logger.info("正在生成订单信息..");
    }
}
