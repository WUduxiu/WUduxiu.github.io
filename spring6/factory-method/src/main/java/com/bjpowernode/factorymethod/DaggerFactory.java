package com.bjpowernode.factorymethod;

/**
 * @date 2022/10/29&23:55
 *  具体武器工厂
 */
public class DaggerFactory extends WeaponFactory{
    @Override
    public Weapon getWeapon() {
        return new Dagger();
    }
}
