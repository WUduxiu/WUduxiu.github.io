package com.powernode.proxy.service;

/**
 * @date 2022/11/3&16:59
 */
public class OrderServiceProxy implements OrderService {
    //代理对象(代理对象和目标对象要具有相同的行为，就要实现一个或者一些相同的接口)
    //客户端在使用代理对象的时候，就像再使用目标对象一样
    //将目标对象当作代理对象的一个属性，这种关系叫做关联关系，比继承关系的耦合度低一点
    //代理对象中有含有目标关系的引用  has  a
    private OrderService target; //这就是目标对象，目标对象一定是实现了OrderService接口

    //创建代理对象的时候，传一个目标对象给代理对象
    public OrderServiceProxy(OrderService target) {
        this.target = target;
    }

    @Override
    public void generate() {//代理方法 要代替目标方法
        //增强功能
        long begin = System.currentTimeMillis();
        //调用目标对象的目标方法
        target.generate();
        long end = System.currentTimeMillis();
        System.out.println("耗时"+(end-begin)+"毫秒");
    }

    @Override
    public void modify() {
        long begin = System.currentTimeMillis();
        target.modify();
        long end = System.currentTimeMillis();
        System.out.println("耗时"+(end-begin)+"毫秒");
    }

    @Override
    public void detail() {
        long begin = System.currentTimeMillis();
        target.detail();
        long end = System.currentTimeMillis();
        System.out.println("耗时"+(end-begin)+"毫秒");
    }//代理对象

}
