package com.study.抽象类abstract_;

public class Abstract01 {
}
 abstract class Animal{
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    public void eat(){
        System.out.println("这是一只动物，但是不知道它吃什么");
    }
    /*
    这里的eat方法即使实现了也没有什么意义
    即：父类的不确定性的问题
    所以可以将该方法设计为abstract方法(抽象方法)
    所谓抽象方法就是没有实现的方法
    所谓没有实现的方法就是没有方法体的方法 eat1()
    当一个类中存在抽象方法时就要将该类声明为抽象类
    一般来说抽象类会被继承，由其子类来实现抽象的方法
     */
    public abstract void eat1();
}
