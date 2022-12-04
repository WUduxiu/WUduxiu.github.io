package com.bjpowernode.simplefactory;

/**
 * @date 2022/10/29&23:21
 *  具体产品角色
 */
public class Fighter extends Weapon{
    @Override
    public void attack() {
        System.out.println("战斗机抛下炸弹");
    }
}
