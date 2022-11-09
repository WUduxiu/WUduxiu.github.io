package com.use;

import com.xiaoqiang.Dog;

import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {
        Dog dog1 =  new Dog();
        System.out.println("小强"+dog1);//xiaoqiang 包里面的Dog类的 hashCode 16进制
        com.xiaoming.Dog dog = new com.xiaoming.Dog();
        System.out.println("小明"+dog);
    }


}
