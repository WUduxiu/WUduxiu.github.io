package com.bjpowernode.factorymethod;

/**
 * @date 2022/10/30&0:02
 */
public class Test {
    public static void main(String[] args) {
        WeaponFactory factory1 = new DaggerFactory();
        Weapon dagger = factory1.getWeapon();
        dagger.attract();
        WeaponFactory gunFactory = new GunFactory();
        Weapon gun = gunFactory.getWeapon();
        gun.attract();
    }
}
