package com.powernode.spring6.service;

import org.springframework.stereotype.Service;

/**
 * @date 2022/11/4&20:40
 */
@Service("orderService")
public class OrderService {//目标对象

    public void generate(){//目标方法
        System.out.println("生成订单");
       /* if (1==1){
            throw new RuntimeException("运行时异常");
        }*/
    }
}
