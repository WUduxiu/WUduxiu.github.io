package com.study.reflect.bean;

import java.lang.reflect.Constructor;

/**
 * @date 2022/10/23&15:57
 */
public class 通过反射机制调用构造器 {
    public static void main(String[] args) throws  Exception{
        //不使用反射机制调用构造器
        Vip vip = new Vip();//无参构造器
        Vip vip1 = new Vip(1);//有参构造器
        Class v = Class.forName("com.study.reflect.bean.Vip");
        //通过反射机制调用无参构造器 创建对象
        Object obj = v.newInstance();
        System.out.println(obj);
        //通过反射机制调用有参构造器
        //1.先获取到这个有参构造方法
        Constructor constructor = v.getConstructor(int.class);
        //2.调用构造方法new对象
        Object obj1 = constructor.newInstance(10);
        System.out.println(obj1);
        Constructor constructor1 = v.getConstructor();//不写参数，也相当于调用无参构造方法
        Object obj2 = constructor1.newInstance();
        System.out.println(obj2);


    }
}
