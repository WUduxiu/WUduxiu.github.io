package com.study.接口interface_.快速入门Interface02;

public interface Interface {//接口也可以定义自己的属性和方法
    int a = 10;//属性不可以不赋值
    /*
    在jdk7.0以前 接口里面所有的方法都没有方法体，即都是抽象方法
    在jdk8.0以后，接口里面可以有默认实现方法和静态方法，也就是说接口里面可以有具体方法的实现
     */

    public void hi();//1.抽象方法  abstract关键字可以不写
    default public void hi2(){//2.default默认实现方法
        System.out.println("default默认实现方法");
    }
    public static void hi3(){//3.静态方法
        System.out.println("静态方法");
    }

}
