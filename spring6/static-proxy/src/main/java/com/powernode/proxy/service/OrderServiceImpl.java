package com.powernode.proxy.service;

import java.lang.annotation.Target;

/**
 * @date 2022/11/2&22:24
 *
 */
public class OrderServiceImpl implements OrderService{//目标对象
    /*
    提出一个新需求：要统计所有业务接口中的每一个业务的耗时
    解决方法1：硬编码，在每一个业务接口中的每一个业务方法中直接添加统计耗时的程序
        这种方案的缺点：
            1：违背了OCP原则
            2.代码没有得到复用(相同的计算耗时的程序写了很多遍)

    解决方案2：编写业务类的子类，让子类继承业务类，对每个业务方法进行重写
        这种方案的缺点：
           缺点1： 虽然解决了OCP原则，但是这种方式会导致耦合度很高，因为采用了继承方式。继承关系是一种耦合度很高的关系，不建议使用
           缺点2：代码没有得到复用

    解决方案3：代理模式
          优点1: 解决了OCP原则
          优点2：采用代理模式的has a ，可以降低耦合度
    目前使用的还是静态代理，静态代理的缺点是什么？
        1.类爆炸：假设有100个方法接口类，就要写100个代理类，这样类的数量会急剧膨胀，不好维护
            怎样解决？
                可以使用动态代理模式解决
          动态代理还是代理模式，只不过添加了字节码生成技术，可以在内存种为我们动态的生成一个Class字节码，这个字节码就是代理类
          在内存中动态的生成字节码代理类的技术，叫做动态代理


     */
    @Override
    public void generate() {  //目标方法
        //模拟生成订单的耗时
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("订单已生成");
    }

    @Override
    public void modify() {
        //模拟修改订单耗时
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("订单已修改");
    }

    @Override
    public void detail() {
        //模拟查看订单耗时
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("请查看订单详情");
    }
}
