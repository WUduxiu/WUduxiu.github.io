package _05方法递归调用._05构造器;

public class Constructor {
    public static void main(String[] args) {
        //当我们new一个对象时，就直接指定这个对象的年龄和姓名
        Person p = new Person("小明",20);
        System.out.println(p.name);
        System.out.println(p.age);
    }
}
class Person{
    /*
    构造器（构造方法）注意事项
    1.构造器没有返回值，也不能写void
    2.构造器名字 和类名一致
    3.（String pName，int pAge）是构造器的形参列表 规则和成员方法一样

     */
    String name;
    int age;
    public Person(String pName,int pAge){
        System.out.println("构造器被调用");
        name = pName;
        age = pAge;


    }
}

