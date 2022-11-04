package com.study.list.exercise;

import java.util.ArrayList;
import java.util.List;

/**
 * @date 2022/10/13&21:21
 */
@SuppressWarnings("all")
public class TeacherListExercise02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book1("三国","A",120));
        list.add(new Book1("水浒传","B",100));
        list.add(new Book1("红楼梦","C",200));
        for (Object o :list) {
            System.out.println("排序前"+o);
        }
        bobbleSort(list);
        System.out.println("-------------------------");
        for (Object o :list) {
            System.out.println("排序后"+o);
        }

    }
    public static void bobbleSort(List list){
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = 0; j < list.size()-1-j; j++) {
                /*
                使用Object接收 list.get()传出来的对象
                然后再向下转型成Book对象
                使用Book对象的 getPrice()进行比较
                 */
                Object o = list.get(j);
                Book1 book1 = (Book1) o;
                Object o1 = list.get(j + 1);
                Book1 book2 = (Book1) o1;
                if (book1.getPrice()>book2.getPrice()){
                    //如果第一本书的价格高于第二本书价格
                    // 就使用list集合的list.set 调换两本书的位置 此时的两本书都是集合里面的元素
                    list.set(j,book2);
                    list.set(j+1,book1);
                }
            }
        }
    }
}
class Book1{
    private String name;
    private String author;
    private double price;

    public Book1(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
         return "书名:" + name + "\t\t\t价格:" + price + "\t\t\t作者:" + author;
    }
}
