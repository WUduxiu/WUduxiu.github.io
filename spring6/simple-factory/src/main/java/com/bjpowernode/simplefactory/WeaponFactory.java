package com.bjpowernode.simplefactory;

/**
 * @date 2022/10/29&23:27
 *  具体工厂角色
 */
public class WeaponFactory {
    //静态方法  生产武器
    //要获取什么武器 就看传什么参数
    //简单工厂模式中有一个静态方法  所以被称为：静态工厂方法模式
    public static Weapon getWeapon(String WeaponType){
        if ("Tank".equals(WeaponType)){
            return new Tank();
        }else if ("Fighter".equals(WeaponType)){
            return new Fighter();
        }else if ("Dagger".equals(WeaponType)){
            return new Dagger();
        }else {
            throw new RuntimeException("武器工厂不能生产该武器");
        }
    }
}
