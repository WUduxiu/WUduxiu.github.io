package com.bjpowernode.factorymethod;

/**
 * @date 2022/10/29&23:53
 *  具体产品角色
 */
public class Gun extends Weapon {
    @Override
    public void attract() {
        System.out.println("步枪开枪射击");
    }
}
