package com.bjpowernode.factorymethod;

/**
 * @date 2022/10/29&23:54
 *  抽象武器工厂
 */
abstract public class WeaponFactory {
    //实例方法  不是静态方法
    public abstract Weapon getWeapon();
}
