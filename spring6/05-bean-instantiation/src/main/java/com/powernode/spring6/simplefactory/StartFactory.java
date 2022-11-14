package com.powernode.spring6.simplefactory;

/**
 * @date 2022/10/30&15:47
 *  简单工厂模式中的工厂角色  星工厂
 */
public class StartFactory {
    //简单工厂模式 中有一个静态方法
    //简单工厂模式又叫做 静态工厂方法模式
    public static Start getStat(){
        //这个Start对象实际上还是我们自己手动new出来的
        return new Start();
    }
}
