package com.study.泛型generic.customgeneric;

import java.util.ArrayList;

/**
 * @date 2022/10/17&11:03
 */
public class CustomMethodGeneric {
    public static void main(String[] args) {
        Car<Integer, ArrayList> car = new Car<>();
        car.hi(100,new ArrayList());//使用了泛型的方法 根据泛型类的泛型
        System.out.println("-----------------------");
        car.hello("123",100);//泛型方法 这边可以直接填入数据，编译器会判断  100是因为进行了自动装箱
        System.out.println("---------------------------");
        car.test("123",20);
    }
}
class Car<U,R>{//泛型类
    public void hi(U u,R r){//使用了泛型的方法
        System.out.println(u.getClass());
        System.out.println(r.getClass());
    }
    public <D,S> void hello(D d,S s){//泛型方法
        System.out.println(d.getClass());
        System.out.println(s.getClass());
    }
    public <D> void test(D d,U u){//泛型方法 使用了泛型
        System.out.println(d.getClass());
        System.out.println(u.getClass());
    }
}
