package com.study.静态方法static_;

public class StaticMethod {
    public static void main(String[] args) {
        Student jack = new Student("jack");
        jack.fee(100);
        Student mary = new Student("mary");
        mary.fee(200);
        Student.showFee();
    }
}
class Student{
    public static int fee;
    public String name;

    public Student(String name) {
        this.name = name;
    }

    public static void  fee(int fee){
        Student.fee +=  fee;
    }
    public static void showFee(){
        System.out.println("总共交了"+Student.fee+"学费");
    }
}
