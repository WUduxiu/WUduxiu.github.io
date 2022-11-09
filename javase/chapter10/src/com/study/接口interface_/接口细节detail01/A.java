package com.study.接口interface_.接口细节detail01;

public interface A {
    public static void main(String[] args) {
        //new A(); 接口不能实例化
    }
    public abstract void test1();//接口的默认修饰符是public + abstract
    void test2();
}
class B implements A{//如果一个类要实现一个接口，就要实现这个类里面的所有方法 或者是将这个类变成抽象类
    @Override
    public void test1() {
        System.out.println("实现了接口");
    }
    /*
    如果更改了B类test2()的修饰方法就会报错 类似于继承的关系 子类不能缩小父类方法的修饰权限
    不是public就会报错 所以接口A类里面的test2()方法的默认修饰符一定就是public
     */
    @Override
    public void test2() {

    }
}
abstract class C implements A{ }//或者是将这个类变成抽象类,可以不实现接口的抽象
