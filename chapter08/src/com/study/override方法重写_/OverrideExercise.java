package com.study.override方法重写_;

public class OverrideExercise {
    public static void main(String[] args) {
        Person person = new Person("jack",20);
        person.say();
        Student student = new Student("xm",20,20200171,80);
        student.say();
    }
}
class Person{
    private  String name;
    private int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void say(){
        System.out.println("Person的"+say1());
    }
    public String say1(){
        return "信息如下：name="+this.name+" age="+this.age;
    }
}
class Student extends Person{
    private int id;
    private int score;
    public Student(String name, int age, int id, int score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public int getScore() {
        return score;
    }

    public void say(){
        System.out.println("Student的"+super.say1()+" id="+this.id+" score="+this.score);
    }
}
