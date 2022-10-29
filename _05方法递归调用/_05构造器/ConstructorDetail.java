package _05方法递归调用._05构造器;

public class ConstructorDetail {
    public static void main(String[] args) {
        Person1 p = new Person1("1");
        System.out.println(p.name);


    }
}
//构造器的重载
class Person1{
    int  age;
    String name;
   public Person1 (String pName){
        name = pName;
    }
   public Person1 (int pAge){
        age = pAge;
    }
   public Person1 (String pName,int pAge){
        name = pName;
        age = pAge;
    }
}
