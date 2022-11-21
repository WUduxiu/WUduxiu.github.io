package com.powernode.spring6.service;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

/**
 * @date 2022/11/4&22:04
 */
//目标对象
@Service("orderService")
public class OrderService {
    //生成订单的业务方法
    public void generate() {
        System.out.println("正在生成订单..");
    }
    //取消订单的业务方法
    public void cancel(){
        System.out.println("订单已取消...");
        throw new RuntimeException("发生异常");
    }
}
