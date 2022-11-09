package com.study.内部类innerclass.局部内部类localinnerclass;
/*
局部内部类是指：定义在外部类的局部位置(方法中)，并且有类名
 */
public class LocalInnerClass {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.m2();
    }
}
class Outer02{
    private int a = 10;//私有属性
    private void m1(){//私有方法
        System.out.println("外部类的私有方法被访问");
    }
    //1.局部内部类是定义在外部类的局部变量中，通常是定义在方法中
    //2.内部类不能添加修饰符，但是可以用final继承使之无法被继承
    //3.作用域：仅仅在定义它的方法或者代码块之中
    public void m2(){
        class Inner02{
            private int a = 20;//内部类的属性
            public void test(){
                //4.局部内部类可以直接访问外部类的成员
                //5.如果外部类和局部内部类的成员重名时，默认遵循就近原则
                //如果要访问外部类的成员则使用(外部类名.this.成员)去访问
                System.out.println("访问内部类的属性:"+a);//能访问到私有的属性和方法
                //(Outer02.this)本质就是外部类的对象，即那个对象调用了方法，(Outer02.this)就是那个对象
                System.out.println("访问外部类的属性:"+Outer02.this.a);
                m1();
            }
        }
        //5.外部类在方法中，可以创建内部类对象，然后调用方法
        Inner02 inner02 = new Inner02();
        inner02.test();
    }
}
