package com.study.单例模式设计single_;

public class 单例懒汉式SingTon02 {
    public static void main(String[] args) {
       Cat cat = Cat.getInstance();
       System.out.println(cat);
        System.out.println(Cat.age);
    }

}
//希望在程序运行过程中，只能创建一只猫对象  使用单例模式
//饿汉式存在多线程安全问题
class Cat{
    private String name;
    public static int age = 1;

    private Cat(String name) {
        System.out.println("创建了构造器");
        this.name = name;
    }
   private static Cat cat;
    public static Cat getInstance(){
        if (cat==null){
            cat = new Cat("橘猫");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
