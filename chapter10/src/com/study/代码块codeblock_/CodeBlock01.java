package com.study.代码块codeblock_;

public class CodeBlock01 {
    public static void main(String[] args) {
        Movie movie1 = new Movie("唐人街");
    }
}
class Movie{
    private String name;
    private double price;
    private String director;
    /*
    代码块：
    1. 使代码看起来不再冗余
    2.可以把相同的代码语句放在一个代码块中，会被优先调用代码块的内容
    3.不管创建那个构造器，创建对象都会优先调用代码块中的内容
    4.代码块的调用顺序优于构造器
     */
    {
        System.out.println("打开屏幕");
        System.out.println("电影开始");
    };
    {
        System.out.println("123");
    }
    public Movie(String name) {
        this.name = name;
        System.out.println("构造器Movie(String name)被调用");
    }

    public Movie(String name, double price, String director) {
        this.name = name;
        this.price = price;
        this.director = director;
        System.out.println("构造器Movie(String name, double price, String director)");
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

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

}
