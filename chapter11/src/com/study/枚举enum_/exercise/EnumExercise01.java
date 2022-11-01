package com.study.枚举enum_.exercise;

/**
 * @date 2022/10/6&22:35
 */
public class EnumExercise01 {
    public static void main(String[] args) {
        /*
        Enum类的to String()方法
        public String toString() {
        return name;返回的就是当前枚举常量的名称
        BOY相当于是 public static final Gender BOY = new Gender();
        BOY返回的就是当前枚举常量的名称
    }
         */
        Gender boy = Gender.BOY;
        Gender boy2 = Gender.BOY;
        System.out.println(boy);//实际上就是调用Gender的父类-->lang包里面的Enum类的to String()方法
        System.out.println(boy2);
        //public static final Gender BOY = new Gender();
        //是一个静态对象 所以boy和boy2是同一个对象
        System.out.println(boy==boy2);//True
    }

}
enum Gender{
    BOY,GIRL;
    Gender() {
    }
    Gender(String name) {//如果调用的是默认构造器，在调用的基础上还要再添加一个有参构造器
        // 则要主动显示一下默认构造器，有了有参构造器会覆盖无参的构造器所有要主动显示
    }

}
