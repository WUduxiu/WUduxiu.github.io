package com.study.extend_继承.improve;

public class Student {//相当于是父类
    public String name;
    public  int age;
    private  double score;

    public void setScore(double score) {
        this.score = score;
    }
    public void show(){
        System.out.println("信息如下：name="+this.name+" age="+this.age+" score="+this.score);
    }
}
