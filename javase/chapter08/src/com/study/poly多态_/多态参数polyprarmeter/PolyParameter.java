package com.study.poly多态_.多态参数polyprarmeter;

public class PolyParameter {
    public static void main(String[] args) {
        Worker worker = new Worker("jack",2000);
        worker.showEmpAnnal(worker);
        Manager manager = new Manager("Tom",2000,2000);
        manager.showEmpAnnal(manager);
        Employee employee = new Employee();
        employee.testWork(manager);
    }
}
