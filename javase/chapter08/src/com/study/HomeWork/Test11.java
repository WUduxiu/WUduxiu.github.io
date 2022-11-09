package com.study.HomeWork;

public class Test11 {
    public static void main(String[] args) {
        //向上转型
        Person11 person11 = new Student();
        person11.eat();
        person11.run();//因为动态绑定机制 方法的调用是看运行类型即 Student类中的run方法
        //向下转型
        Student student = (Student) person11;
        student.study();
        student.eat();//Student中没有eat()方法 就去父类中寻找
        student.run();

    }
}
class Person11{
    public void run(){
        System.out.println("Person run");
    }
    public void eat(){
        System.out.println("Person eat");
    }
}
class Student extends Person11{
    public void run(){
        System.out.println("Student run");
    }
    public void study(){
        System.out.println("Student study...");
    }
}
