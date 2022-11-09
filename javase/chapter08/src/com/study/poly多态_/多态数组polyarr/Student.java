package com.study.poly多态_.多态数组polyarr;

public class Student extends Person{
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    //重写say()方法 加上特有的属性

    @Override
    public String say() {
        return "学生："+super.say()+" score=" + score;
    }
    public void study(){
        System.out.println("学生"+getName()+"正在学习");
    }
}
