package org.powernode.service;
import org.powernode.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @date 2022/11/1&23:29
 */
@Service("orderService")
public class OrderService {
    //这个注解可以直接使用 不需要写value的值 相当于是xml里面自动装配的ByType自动装配
    /*
    当有两个相同类型的实现类实现了这个接口  由于是类型自动装配无法区分
    这时候要使用@AutoWried 和 @Qualifier联合使用 可以使用按名字进行自动装配
     */
    @Autowired
    @Qualifier("orderDaoImplForMySQL")
    private OrderDao orderDao;
    public void generate(){
        orderDao.insert();
    }

    /*  可以出现的位置
    @Autowired
    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }
    @Autowired
    public OrderService(OrderDao orderDao) {
        this.orderDao = orderDao;
    }*/
 //如果一个类当中 构造方法只有一个，并且构造方法上面的参数和属性能够对应上 @AutoWried可以省略  一般不省略
   /* public OrderService(OrderDao orderDao) {
        this.orderDao = orderDao;
    }*/
}
