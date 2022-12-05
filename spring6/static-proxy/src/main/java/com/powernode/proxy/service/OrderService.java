package com.powernode.proxy.service;

/**
 * @date 2022/11/2&22:22
 *  订单业务接口
 *
 */
public interface OrderService {//公共接口
    //生成订单
    void generate();
    //修改订单
    void modify();
    //查看订单详情
    void detail();
}
