package _07方法练习;

public class Test05 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("面积为"+circle.area());
        System.out.println("周长为"+circle.len());
    }
}
class Circle{
     double radius;
     public Circle(double radius){
         this.radius = radius;
     }
    public double area(){//Math.PI 表示为派  （3.1415926）
        return Math.PI*radius*radius;
    }
    public double len(){
        return 2*radius*Math.PI;
    }
}
