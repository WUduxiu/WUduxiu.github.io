package com.study.HomeWork;


public class Test04 {
    public static void main(String[] args) {
        Manager manager = new Manager("王",100,30,1.2);
        manager.setBonus(5000);
        manager.printSal();
        Worker worker = new Worker("李四", 100, 30, 1);
        worker.printSal();


    }
}
class Employee{
    private String name;
    private double daySalary;
    private int workDays;
    private double level;

    public Employee(String name, double daySalary, int workDays, double level) {
        this.name = name;
        this.daySalary = daySalary;
        this.workDays = workDays;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDaySalary() {
        return daySalary;
    }

    public void setDaySalary(double daySalary) {
        this.daySalary = daySalary;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }
    public void printSal(){
        System.out.println(","+name+"你的工资为"+daySalary*workDays*level);
    }
}
class Manager extends Employee{
    //经理特有的属性 但是不加入构造器中 用Set方法去设定
    private double bonus;

    public Manager(String name, double daySalary, int workDays, double level) {
        super(name, daySalary, workDays, level);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public void printSal(){
        System.out.println(getName()+"经理,你的工资为："+((getDaySalary()*getWorkDays()*getLevel())+bonus));
    }
}
class Worker extends Employee{
    public Worker(String name, double daySalary, int workDays, double level) {
        super(name, daySalary, workDays, level);
    }
    public void printSal(){
        System.out.print("普通员工");
        super.printSal();
    }
}

