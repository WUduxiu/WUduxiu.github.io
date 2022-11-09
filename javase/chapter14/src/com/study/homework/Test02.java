package com.study.homework;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @date 2022/10/16&17:27
 */
@SuppressWarnings("all")
public class Test02 {
    public static void main(String[] args) {
        Car car1 = new Car("宝马", 3000);
        Car car2 = new Car("奔驰", 4000);
        ArrayList list = new ArrayList();
        ArrayList list1 = new ArrayList();
        list1.add(car1);
        list1.add(car2);
        list.add(car1);
        list.add(car2);
        list.add("1");
        list.remove("1");
        int size = list.size();
        System.out.println(size);
        boolean empty = list.isEmpty();
        System.out.println(empty);//f
       // list.clear();
        list.addAll(list1);
        System.out.println(list);
        boolean b = list.containsAll(list1);//里面可以传集合进去 判断多个元素是否存在
        System.out.println(b);//t
        list1.removeAll(list1);//删除多个元素
        System.out.println(list1);
        for (Object o :list) {
            System.out.println(o);
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);

        }

    }
}
class Car{
    private String name;
    private int price;

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
