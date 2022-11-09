package com.study.poly多态_.动态绑定机制dynamic_;

public class DynamicBinding {
    public static void main(String[] args) {
        A a = new B();
        //java的动态绑定机制：
        /*
        1.当调用对象方法时，该方法会和该对象的运行类型绑定
        2.当调用对象属性时，没有动态绑定机制，哪里声明使用哪里
         */
        //此时 A是编译类型  B是运行类型  调用方法时进行了动态绑定，
        // 去调用B类中的sum()方法，此时B类中没有sum()方法，根据继承去调用A类中的sum()方法
        //A类中又要调用 getI()方法，再去B类中找
        //因为属性没有动态绑定方法 ，直接使用

        System.out.println(a.sum());//使用了B类中的属性+A类中的sum()方法=10+20
        System.out.println(a.sum1());//使用了A类中的属性+A类中的sum1()方法=10+10
    }
}
class A{
    public int i = 10;
    public int sum(){
        return getI()+10;
    }
    public int sum1(){
        return i +10;
    }
    public int getI(){
        return i;
    }
}
class B extends A{
    public int i = 20;
//    public int sum(){
//        return getI()+20;
//    }
//    public int sum1(){
//        return i +10;
//    }
    public int getI(){
        return i;
    }
}
