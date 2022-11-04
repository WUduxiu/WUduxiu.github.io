package com.study.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


/**
 * @date 2022/10/13&17:42
 */
public class CollectionIterator {
    public static void main(String[] args) {
        /*
        1.Iterator迭代器，实现了Collection接口的集合都有这个方法，主要遍历Collection集合中的元素
        2.所有实现了Collection接口的集合类都有一个Iterator()方法，可以返回一个迭代器
        3.Iterator
        4.Iterator仅用于遍历集合，Iterator本身并不存放对象
         */
        Collection arrayList = new ArrayList();
        arrayList.add(new Book("三国演义",100));
        arrayList.add(new Book("红楼梦",50));
        Iterator iterator = arrayList.iterator();
        //itit 快捷键
        while (iterator.hasNext()) {
            //Object obj = iterator.next();   iterator.next()返回的类型是一个对象
            Book book = (Book) iterator.next();//动态绑定  编译类型是Object 运行类型是Book类
            System.out.println("obj="+book);
        }
        /*
        当退出while循环后，此时的iterator迭代器已经指向最后一个元素了
        如果再次遍历就会报错
        iterator.next()  NoSuchElementException
        这时需要重置迭代器
         */
         iterator = arrayList.iterator();// 重置迭代器
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);

        }


    }
}
class Book{
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
