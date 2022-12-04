package com.bjpowernode.simplefactory;

/**
 * @date 2022/10/29&23:32
 *  客户端程序
 */
public class Test {
    public static void main(String[] args) {
        /*
            对于客户端来说，坦克的生产细节，不需要关系，只需要向工厂索要即可
            简单工厂模式达到了什么？ 达到了职责分离，客户不需要关心生产细节
            客户端只需要关系消费即可，工厂负责生产，客户端负责消费
         */
        //需要武器-坦克
        Weapon tank = WeaponFactory.getWeapon("Tank");
        tank.attack();//武器坦克的攻击
        //需要武器-战斗机
        Weapon fighter = WeaponFactory.getWeapon("Fighter");
        fighter.attack();
        //需要武器-匕首
        Weapon dagger = WeaponFactory.getWeapon("Dagger");
        dagger.attack();
        //需要武器-步枪
        Weapon gun = WeaponFactory.getWeapon("Gun");
        gun.attack();
    }
}
