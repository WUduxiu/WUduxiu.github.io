package com.study.override方法重写_;

public class Override01 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.cry();
        dog.m1();
    }
}
class Animal{
    public void cry(){
        System.out.println("动物哭喊");
    }
    public Object m1(){
        return null;
    }
    public void m2(){

    }
}
class Dog extends Animal{
    //1.因为Dog类是Animal类的子类
    //2.Dog的cry方法 和Animal的cry方法定义形式一样（方法名称、返回类型、参数
    //返回类型中 子类的返回类型也可以是父类的返回类的子类 例如下面的m1方法 （String 是 Object的子类）
    //3.这时我们就说Dog的cry方法重写了 Animal的cry方法
    //4.子类方法不能缩小父类方法的权限：public>protected>默认修饰符>private
    public void cry(){
        System.out.println("小狗喊叫");
    }
    public String m1(){
        return "String 是Object的子类";
    }
    public void m2(){

    }
}
