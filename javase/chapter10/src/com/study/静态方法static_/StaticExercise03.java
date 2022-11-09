package com.study.静态方法static_;

public class StaticExercise03 {
    public static void main(String[] args) {
        Test.setTotalPerson(3);
        new Test();
        Test.showTotal();//4
    }
}
class Test{
    private int id;
    private static int total = 0;
    public static void setTotalPerson(int total){
        //this.total = total;
        Test.total =total;
    }
    public Test(){
        total++;
        id = total;
    }
    public static void showTotal(){
        System.out.println("total的值为"+total);
    }
}
