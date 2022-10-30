package com.study.HomeWork;

import java.io.PrintStream;

public class Test05 {
    public static void main(String[] args) {
        Teacher2 teacher2 = new Teacher2("张三","教师",3000);
        teacher2.setClassDay(300);
        teacher2.setClassSal(100);
        teacher2.printSal();
        Farmer farmer = new Farmer("李四","农民",3000);
        farmer.printSal();
        Scientist scientist = new Scientist("王五", "科学家", 3000);
        scientist.setBonus(100000);
        scientist.printSal();

    }
}
class Employee2{
    private String name;
    private String job;
    private double salMonth;
    //默认设定一年十二个月工资   后续可以根据Set方法进行更改
    private int workMonths = 12;

    public Employee2(String name, String job, double salMonth) {
        this.name = name;
        this.job = job;
        this.salMonth = salMonth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSalMonth() {
        return salMonth;
    }

    public void setSalMonth(double salMonth) {
        this.salMonth = salMonth;
    }

    public int getWorkMonths() {
        return workMonths;
    }

    public void setWorkMonths(int workMonths) {
        this.workMonths = workMonths;
    }
    public void printSal(){
        System.out.println(getJob()+": "+getName()+" 你的年薪为"+(workMonths*salMonth));
    }
}
class Farmer extends Employee2{
    public Farmer(String name, String job, double salMonth) {
        super(name, job, salMonth);
    }
    public void printSal(){
        super.printSal();
    }
}
class Teacher2 extends Employee2{
    private int classDay;
    private double classSal;

    public Teacher2(String name, String job, double salMonth) {
        super(name, job, salMonth);
    }

    public int getClassDay() {
        return classDay;
    }

    public void setClassDay(int classDay) {
        this.classDay = classDay;
    }

    public double getClassSal() {
        return classSal;
    }

    public void setClassSal(double classSal) {
        this.classSal = classSal;
    }
    public void printSal(){
        System.out.println(getJob()+": "+getName()+" 你的年薪为"+(getSalMonth()*getWorkMonths()+classSal*classDay));
    }
}
class Scientist extends Employee2{
    private double bonus;

    public Scientist(String name, String job, double salMonth) {
        super(name, job, salMonth);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public void printSal(){
        System.out.println(getJob()+": "+getName()+" 你的年薪为"+(getSalMonth()*getWorkMonths()+bonus));
    }
}
