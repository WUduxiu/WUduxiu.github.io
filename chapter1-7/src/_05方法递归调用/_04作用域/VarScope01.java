package _05方法递归调用._04作用域;

public class VarScope01 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.cry();
    }
}
//在java编程中，主要的变量就是属性（成员变量）和 局部变量
class Cat{
    int age;
    double weight;
    String color;
    //像这些都是都是Cat类的属性（成员变量） 这些变量都能在成员方法中使用
     void cry(){
         //在cry方法里面的变量  n，name 只能在cry中使用
        int n =10;//使用局部变量要赋值，赋值以后才能使用，因为没有默认值
        String name = "jack";

        //像这种在成员方法里面定义的变量就是局部变量
        System.out.println(age+age+color);//使用全局变量可以不赋值有默认值

    }
}
