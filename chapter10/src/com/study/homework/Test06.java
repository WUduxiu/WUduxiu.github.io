package com.study.homework;

import com.study.抽象类abstract_.抽象类设计模板.B;

/**
 * @date 2022/10/8&11:21
 */
public class Test06 {
    public static void main(String[] args) {
        Person person = new Person("唐僧",new Horse());
        person.passRiver();
        person.passFire();
        person.passRoad();
    }

    private String name;
}
interface Vehicles{
    void work();
}
class Horse implements Vehicles{
    @Override
    public void work() {
        System.out.println("一般情况使用的交通工具");
    }
}
class Boat implements Vehicles{
    @Override
    public void work() {
        System.out.println("遇到大河时使用的交通工具");
    }
}
class plant implements Vehicles{

    @Override
    public void work() {
        System.out.println("过火焰山使用飞机");
    }
}
class VehiclesFactory{
    /*
    使用饿汉式 保证每次的马儿都是同一匹马
     */
    private static Horse horse = new Horse();//静态属性，类一加载就创建对象

    private VehiclesFactory() {//私有化构造器，防止在别的类 new一个新对象
    }

    public static Horse getHorse(){
        return horse;
    }

    public static Boat getBoat(){
        return new Boat();
    }
    public static plant getPlant(){
        return new plant();
    }
}
class Person{
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
    //判断一下，当前的Vehicles工具,如果属性是null，就获取一匹马
    public void passRoad(){
        /*
        !(vehicles instanceof Horse)结果取反
        如果交通工具是马则是false，执行 vehicles.work();
        如果交通工具为null，或者不是马则为ture ，执行vehicles = VehiclesFactory.getHorse();
         */
        if (!(vehicles instanceof Horse)){
            vehicles = VehiclesFactory.getHorse();//使用了VehiclesFactory里面的方法 类加载创建了马对象
        }
        vehicles.work();
    }

    public void passRiver(){
       if (!(vehicles instanceof Boat)){
           vehicles = VehiclesFactory.getBoat();
       }
       vehicles.work();
    }
    public void passFire(){
        if (!(vehicles instanceof plant)){
            vehicles = VehiclesFactory.getPlant();
        }
        vehicles.work();
    }
}
