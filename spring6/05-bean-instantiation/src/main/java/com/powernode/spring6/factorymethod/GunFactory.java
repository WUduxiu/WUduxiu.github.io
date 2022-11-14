package com.powernode.spring6.factorymethod;

/**
 * @date 2022/10/30&16:10
 *  工厂方法模式中的具体工厂角色
 */
public class GunFactory {
    //实例方法
    public Gun getGun(){
        //这里还是我们自己进行new对象的
        return new Gun();
    }
}
