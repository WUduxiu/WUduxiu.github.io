package _07方法练习;

public class Test13 {
    public static void main(String[] args) {
        Circle1 c = new Circle1(5);
        c.findArea();
        PassObject p = new PassObject(c,5);
        p.printAreas();

    }
}
class Circle1{
    double radius;
    public Circle1(double radius){
        this.radius = radius;
    }
    public double findArea(){
        return 3.14*radius*radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
}
class PassObject{
    int times;
    Circle1 c;
    double radius;
    public PassObject(Circle1 c,int times){
        this.times = times;
        this.c = c;
    }
    public void printAreas(){
        System.out.println("Radius"+"\tArea");
        for(int i=1;i<=this.times;i++){
            c.setRadius(i);
            System.out.println((double) i+ "\t"+"\t" + c.findArea());
        }

    }
}
