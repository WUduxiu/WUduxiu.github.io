package com.study.collection.exercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @date 2022/10/13&19:04
 */
public class CollectionExercise01 {
    public static void main(String[] args) {
        Collection arrayList = new ArrayList();
        arrayList.add(new Dog("1",2));
        arrayList.add(new Dog("2",3));
        for (Object o :arrayList) {
            System.out.println("o="+o);
        }
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            Object dog = iterator.next();
            System.out.println("dog="+dog);
        }

    }
}
class Dog{
    private String name;
    private double age;

    public Dog(String name, double age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{name=" + name + " age=" + age +"}";
    }
}
