package com.study.静态方法static_;

public class StaticExercise02 {
    public static void main(String[] args) {
        System.out.println("Number of total is"+Person.getTotalPerson());//0
        Person p1 = new Person();//1
        System.out.println("Number of total is"+Person.getTotalPerson());//1
    }

}
class Person{
    private static int id;
    private static int total;
    public static int getTotalPerson(){
        id++;
        return total;
    }
    public Person(){
        total++;
        id = total;
        System.out.println(total);
    }
}
