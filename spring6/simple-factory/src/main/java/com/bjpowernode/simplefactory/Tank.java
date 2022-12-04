package com.bjpowernode.simplefactory;

/**
 * @date 2022/10/29&23:21
 *  具体产品角色
 */
public class Tank extends Weapon{
    @Override
    public void attack() {
        System.out.println("坦克开炮");
    }
}
