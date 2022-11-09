package com.study.接口interface_;

public class 接口和继承的区别InterfaceVSExtends {
    public static void main(String[] args) {
        BabyMonkey babyMonkey = new BabyMonkey("123");
        babyMonkey.climbing();
        babyMonkey.swimming();
    }
}
class Monkey{
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void climbing(){
        System.out.println(name+" 会爬树");
    }
}
/*
当子类继承了父类，就自动拥有父类的功能
如果子类需要拓展功能，可以通过实现接口的方式扩展
可以理解 实现接口 是对java单继承机制的一种补充
 */
class BabyMonkey extends Monkey implements Fish,Bird{
    public BabyMonkey(String name) {
        super(name);
    }
    @Override
    public void swimming() {
        System.out.println(getName()+"通过学习，学会了游泳");
    }

    @Override
    public void Flying() {
        System.out.println(getName()+"通过学习，学会了飞翔");
    }
}
interface Fish{
    String name = "小鱼";
    public void swimming();
}
interface Bird{
    void Flying();
}
