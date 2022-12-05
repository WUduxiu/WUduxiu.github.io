package com.powernode.proxy.client;

import com.powernode.proxy.service.OrderService;
import com.powernode.proxy.service.OrderServiceImpl;
import com.powernode.proxy.service.OrderServiceImplSon;
import com.powernode.proxy.service.OrderServiceProxy;

/**
 * @date 2022/11/2&22:28
 */
public class Test {
    public static void main(String[] args) {
      /*  OrderService orderService = new OrderServiceImplSon();
        orderService.generate();
        orderService.modify();
        orderService.detail();*/
        //创建目标对象
        OrderService target = new OrderServiceImpl();
        //创建代理对象
        OrderService orderService = new OrderServiceProxy(target);
        //调用代理对象里面的代理方法
        orderService.generate();
        orderService.modify();
        orderService.detail();
    }


}
