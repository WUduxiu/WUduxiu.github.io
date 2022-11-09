package com.study.常用类.arrays类.exercise;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @date 2022/10/12&17:22
 */
public class ArrayExercise01 {
    public static void main(String[] args) {
        Book [] books = new Book[4];
        books[0] = new Book("红楼梦",100);
        books[1] = new Book("金瓶梅3",90);
        books[2] = new Book("青年文摘2",5);
        books[3] = new Book("java123",300);
        //按照价格从大到小排序
        newSort(books, new Comparator() {
            @Override
            public int compare(Object o1,Object o2) {
//                Object a = new Book("123",20);
//                Book book = (Book) a;   向下转型
                Book book1 = (Book) o1;
                Book book2 = (Book) o2;
                double priceVal = book1.getPrice()-book2.getPrice();
                if (priceVal > 0){
                    return -1;
                }else if (priceVal < 0){
                    return 1;
                }else {
                    return 0;
                }
            }
        });
        System.out.println("按价格从大到小排序后"+Arrays.toString(books));
        //按照书名的长度从大到小排序
        newSort(books, new Comparator() {
            @Override
            public int compare(Object o1,Object o2) {
//                Object a = new Book("123",20);
//                Book book = (Book) a;   向下转型
                return ((Book) o2).getName().length()-((Book) o1).getName().length();
            }
        });
        System.out.println("按照书名的长度从大到小排序"+Arrays.toString(books));


    }
    public static void newSort(Object[] arr,Comparator c){
        Object temp = new Object();
        for (int i = 0; i < arr.length; i++) {
            for (int j =0;j<arr.length-i-1;j++){
                if (c.compare(arr[j],arr[j+1])>0){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
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
