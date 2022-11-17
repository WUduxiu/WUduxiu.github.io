package org.powernode.dao.Impl;

import org.powernode.dao.OrderDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @date 2022/11/1&23:28
 */
@Repository("orderDaoImplForMySQL")
public class OrderDaoImplForMySQL implements OrderDao {
    @Override
    public void insert() {
        System.out.println("Mysql正在保存数据库信息");
    }
}
