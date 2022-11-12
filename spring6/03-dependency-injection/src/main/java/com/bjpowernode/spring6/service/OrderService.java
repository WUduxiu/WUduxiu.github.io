package com.bjpowernode.spring6.service;

import com.bjpowernode.spring6.dao.OrderDao;

/**
 * @date 2022/10/28&20:21
 */
public class OrderService {
    private OrderDao orderDao;

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }
    public void generate(){
        orderDao.insert();
    }
}
