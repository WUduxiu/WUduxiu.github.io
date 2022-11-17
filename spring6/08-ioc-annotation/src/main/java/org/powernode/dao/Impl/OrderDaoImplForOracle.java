package org.powernode.dao.Impl;

import org.powernode.dao.OrderDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @date 2022/11/1&23:40
 */
@Repository("orderDaoImplForOracle")
public class OrderDaoImplForOracle implements OrderDao {
    @Override
    public void insert() {
        System.out.println("Oracle正在保存数据库信息");
    }
}
