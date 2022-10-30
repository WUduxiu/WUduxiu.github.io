package com.study.final_.exercise;

public class FinalExercise01 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.method();

    }
}
class Circle{
    private double r;
    private final double PI = 3.14;
    private final double PI2;
    private final double PI3;
    {
        PI2 = 3.14;
    }
    public void method(){
        double s = PI*r*r;
        System.out.println("圆的面积为："+s);
    }
    public Circle(double r) {
        this.r = r;
        PI3 = 3.14;
    }

}


