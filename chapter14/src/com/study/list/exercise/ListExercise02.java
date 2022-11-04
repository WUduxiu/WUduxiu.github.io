package com.study.list.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @date 2022/10/13&20:08
 */
public class ListExercise02 {
    public static void main(String[] args) {
        Book [] books = new Book[3];
        books[0] = new Book("三国演义","A",100);
        books[1] = new Book("水浒传","B",80);
        books[2] = new Book("西游记","C",150);
        bobbleSort(books);
        List list = new ArrayList();
        Collections.addAll(list, books);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
    public static void bobbleSort(Book[] books){
        Book temp = new Book();
        for (int i = 0; i < books.length-1; i++) {
            for (int j = 0; j < books.length-1-i; j++) {
                if (books[j].getPrice()>books[j+1].getPrice()){
                    temp = books[j];
                    books[j] = books[j+1];
                    books[j+1] = temp;
                }
            }
        }
    }
}
class Book{
    private String name;
    private String author;
    private double price;

    public Book() {
    }

    public Book(String name, String author, double price) {
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
