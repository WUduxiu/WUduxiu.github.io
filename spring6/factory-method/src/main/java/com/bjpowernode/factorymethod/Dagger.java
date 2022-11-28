package com.bjpowernode.factorymethod;

/**
 * @date 2022/10/29&23:53
 */
//  具体产品角色
public class Dagger extends Weapon {
    @Override
    public void attract() {
        System.out.println("匕首刺人");
    }
}
