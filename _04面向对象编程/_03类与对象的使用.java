package _04面向对象编程;

public class _03类与对象的使用 {

    public static void main(String[] args) {
        person p1 = new person();
        p1.age = 10;
        p1.name = "小明";
        person p2 = p1;
        System.out.println(p2.name);//输出结果为小明
        p2.age = 80;
        System.out.println("p1的年龄为"+p1.age);//输出结果为80
        p2=null;
        System.out.println("p2的年龄为"+p2.age);//抛出异常


    }

}
class person{
    int age;
    String name;
}
