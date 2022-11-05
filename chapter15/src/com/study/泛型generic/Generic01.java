package com.study.泛型generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @date 2022/10/14&22:57
 */
@SuppressWarnings("all")
public class Generic01 {
    public static void main(String[] args) {
        /*
        JDK 5.0之后，推出的型特性 :泛型
         */
        //不用泛型机制，分析程序存在的缺点
        List list = new ArrayList();
        //准备对象
        Cat cat = new Cat();
        Bird bird = new Bird();
        list.add(cat);
        list.add(bird);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            if (next instanceof Animal){
                ((Animal) next).move();
            }

        }
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            if (obj instanceof Cat){
                ((Cat) obj).catchMouse();
            }else if (obj instanceof Bird){
                ((Bird) obj).fly();
            }
        }

    }
}
class Animal{
    public void move(){
        System.out.println("动物在移动");
    }
}
class Cat extends Animal{
    public void catchMouse(){
        System.out.println("猫会抓老鼠");
    }
}
class Bird extends Animal{
    public void fly(){
        System.out.println("鸟会飞");
    }
}
