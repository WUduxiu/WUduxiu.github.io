package com.study.encap封装方法;

import java.util.Scanner;

public class encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(18);
        person.setName("小王");
        person.getInfo();
        person.setSalary(3000);
        person.showSalary();
       Person p = new Person("jack",20,3000);
        p.showSalary();
        p.getInfo();

    }


}
class Person{
    public Person() {//无参构造器

    }
    //三个参数的构造器
    //使用构造器可以绕过 set方法设置的条件，所以可以将 set方法写入构造器中
    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        setName(name);
        setSalary(salary);
        setAge(age);
    }

    public String name;//公开的
    private int age;//私有化
    private double salary;//私有化

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length()>=2&&name.length()<=6){
            this.name = name;
        }else {
            System.out.println("请输入正确的名字，字符串(2-6)，返回默认值");
            this.name = null;
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (1<=age&&age<=100){
            this.age = age;
        }else{
            System.out.println("年龄输入有误，不在（1-100）之间，返回默认值0");
            this.age = 0;
        }

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入密码");
        int password = scanner.nextInt();
        if (password ==123456){
            this.salary = salary;
        }else {
            System.out.println("密码输入错误，无法查看工资");
            this.salary = 0.0;
        }
    }
    public void getInfo(){
        System.out.println("name="+this.name+" age="+this.age);
    }
    public void showSalary(){
        System.out.println("salary="+this.salary);
    }

}
