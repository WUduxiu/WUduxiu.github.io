package com.study.抽象类abstract_.exercise;

public class AbstractExercise01 {
    public static void main(String[] args) {
        Manager jack = new Manager("jack", 3000, 1);
        jack.setBonus(3000);
        jack.printSalary();
        jack.work();
        CommonEmployee mike = new CommonEmployee("mike", 3000, 2);
        mike.printSalary();
        mike.work();

    }

}
abstract class Employee{
    private String name;
    private double salary = 3000;
    private int id;

    public Employee(String name, double salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract void work();
    public void printSalary(){
        System.out.print(getName()+": 你的工资为");
    }
}
class Manager extends Employee{
    private double bonus;

    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, double salary, int id) {
        super(name, salary, id);
    }
    @Override
    public void work() {
        System.out.println("经理: " +getName()+" 正在工作中");
    }

    @Override
    public void printSalary() {
        super.printSalary();
        System.out.println(getSalary()+getSalary());
    }
}
class CommonEmployee extends Employee{
    public CommonEmployee(String name, double salary, int id) {
        super(name, salary, id);
    }

    @Override
    public void work() {
        System.out.println("普通员工: " +getName()+" 正在工作");
    }

    @Override
    public void printSalary() {
        super.printSalary();
        System.out.println(getSalary());
    }
}
