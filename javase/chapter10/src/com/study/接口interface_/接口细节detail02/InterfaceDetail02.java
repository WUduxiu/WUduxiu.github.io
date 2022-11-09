package com.study.接口interface_.接口细节detail02;

public interface InterfaceDetail02 {
    public static void main(String[] args) {
        //A a = new A();接口不能实例化
        System.out.println(A.a);//能直接调用说明接口A类中的int a属性是static的
        //A.a = 20;不能直接修改说明接口A类中的int a属性是final的，不能在进行赋值

    }
}
interface A{
   public static final int a = 10;//接口中的属性，只能是final，而且是public static final修饰的属性
    void a();
}
interface B{
    void b();
}
interface C extends A,B{}//接口可以继承多个别的接口，但是不能继承其他类
class test implements A,B{//一个类可以实现多个接口，但是必须实现所有抽象方法
    @Override
    public void a() {

    }

    @Override
    public void b() {

    }

}
