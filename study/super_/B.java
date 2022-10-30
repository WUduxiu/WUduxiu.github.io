package com.study.super_;

public class B extends A{
    int n1 = 88;
    public static void main(String[] args) {
        B b = new B();
        //b.attribute();
        b.sum();
    }
    //访问父类构造器 只能在构造器里的第一行使用
    public B(){
        super("jack");
        System.out.println("子类构造器被创建");
    }
    public B(String name){

    }
    public void attribute(){//attribute 属性
        //使用super.属性 访问父类的属性 但是使用private修饰符的无法直接访问
        System.out.println(super.n1+" "+super.n2+" "+super.n3);
    }
    public void method(){
        super.test100();
        super.test200();
        super.test300();
    }
    public void cal(){
        System.out.println("B类中的cal()方法被调用");
    }
    public void sum(){
        //调用A类中 cal()方法的三种方式  寻找属性也一样
        System.out.println("sum()被调用...");
        //找cal（）方法的顺序是
        /*
        1.先找本类，如果有则调用
        2.如果没有，则找父类（如果有并且可以调用，则调用）
        3.如果父类没有，则在父类的父类中找，直到Obiect类
        4.如果找到了，但是不能访问，则报错： cannot access
        5.如果没找到，则报错 提示该方法不存在
         */
        cal();//按照上面的逻辑
        this.cal();//按照上面的逻辑
        super.cal();//不寻找本类直接查找父类,其他规则一样
        System.out.println(n1);//此时的n1是B类的属性        输出88
        System.out.println(this.n1);//此时的n1是B类的属性  输出88
        System.out.println(super.n1);//使用super直接去父类查找，跳过本类的查找  输出默认值0
        System.out.println(age);//因为父类没有age这个属性  所以就去A类的父类->Base类中寻找， 输出 99
        eat();//和属性age寻找方式一样

    }
}
