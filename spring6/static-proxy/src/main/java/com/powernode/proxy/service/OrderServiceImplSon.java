package com.powernode.proxy.service;

/**
 * @date 2022/11/2&22:41
 */
public class OrderServiceImplSon extends OrderServiceImpl{
    //ctrl + o 快捷键  重写父类中的方法
    //解决方案2:  写一个子类去继承父类  在子类里面 添加计算耗时程序  没有违背OCP原则
    /*
    该方法的缺点
       缺点1： 虽然解决了OCP原则，但是这种方式会导致耦合度很高，因为采用了继承方式。继承关系是一种耦合度很高的关系，不建议使用
       缺点2：代码没有得到复用
     */
    @Override
    public void generate() {
        long begin = System.currentTimeMillis();
        super.generate();
        long end = System.currentTimeMillis();
        System.out.println("耗时"+(end-begin)+"毫秒");
    }

    @Override
    public void modify() {
        long begin = System.currentTimeMillis();
        super.modify();
        long end = System.currentTimeMillis();
        System.out.println("耗时"+(end-begin)+"毫秒");
    }

    @Override
    public void detail() {
        long begin = System.currentTimeMillis();
        super.detail();
        long end = System.currentTimeMillis();
        System.out.println("耗时"+(end-begin)+"毫秒");
    }
}
