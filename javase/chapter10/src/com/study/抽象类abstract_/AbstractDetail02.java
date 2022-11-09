package com.study.抽象类abstract_;

public  class AbstractDetail02 {
}
 abstract class H{//抽象类不能使用private final  static修饰，因为这三个关键字都是和重写违背的
    //private abstract void say(); //因为private修饰后外部类(子类)无法访问该方法，抽象类就无法实现
    //public abstract final void say(); 因为final修饰后方法无法再修改，子类无法进行方法的重写
    // public static abstract void say();因为static与方法的重写无关
 }
//抽象类的本质还是一个类  可以有普通类的其他属性例如：非抽象方法、构造器、静态属性等等
 abstract class D{
    public int a = 10;
    public static int b = 20;

    public D(int a) {
        this.a = a;
    }
    public void sayHello(){
        System.out.println("hello");
    }
    public abstract void sayHi();
    public abstract void sayHi2();
}
//如果一个类继承了抽象类，则它必须实现父类抽象类的所以抽象方法，或者自己也声明为抽象类
class E extends D{
    public E(int a) {
        super(a);
    }

    @Override
    public void sayHi() {//在语法层面方法加了方法体就算实现了方法

    }
    @Override
    public void sayHi2() {

    }
}
abstract class F extends D{//将自己也声明为抽象类
    public F(int a) {
        super(a);
    }
}
