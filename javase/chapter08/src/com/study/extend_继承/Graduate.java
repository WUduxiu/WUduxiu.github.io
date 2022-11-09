package com.study.extend_继承;

public class Graduate {
    public  String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }
    public void tseting(){
        System.out.println("name="+this.name+" age="+this.age+" 正在进行大学考试");
    }
    public void show(){
        System.out.println("信息如下 name="+this.name+" age="+this.age+" score="+this.score);
    }
}
