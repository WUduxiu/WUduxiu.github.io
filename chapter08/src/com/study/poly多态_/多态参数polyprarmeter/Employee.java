package com.study.poly多态_.多态参数polyprarmeter;

public class Employee {
    private String name;
    private double salary;
    public Employee(){

    }
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
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
    public double getAnnual(){
        return 12*salary;
    }
    public void showEmpAnnal(Employee employee){
        if (employee instanceof Worker){
            System.out.println("员工"+getName()+"你的年工资为"+getAnnual());
        }else if (employee instanceof Manager){
            System.out.println("经理"+getName()+"你的年工资为"+getAnnual());
        }

    }
    public void testWork(Employee employee){
        if (employee instanceof Worker){//向下转型  也可写成((Worker) employee).work();
            Worker worker = (Worker) employee;
            worker.work();
        }else if (employee instanceof Manager){//向下转型
            //((Manager) employee).manage();
           Manager manager = (Manager) employee;
           manager.manage();
        }else {
            System.out.println("不做处理");
        }
    }
}
