package com.study.poly多态_.多态参数polyprarmeter;

public class Worker extends Employee{
    public Worker(String name, double salary) {
        super(name, salary);
    }
    public Worker(){

    }
    public void work(){
        System.out.println("员工"+getName()+"正在工作");
    }
    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
