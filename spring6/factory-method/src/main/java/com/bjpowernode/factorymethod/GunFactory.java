package com.bjpowernode.factorymethod;

/**
 * @date 2022/10/29&23:56
 *  具体武器工厂
 */
public class GunFactory extends WeaponFactory {
    @Override
    public Weapon getWeapon() {
        return new Gun();
    }
}
