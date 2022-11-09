package _05方法递归调用._06This关键字;

public class TestPerson {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.compareTo(30,"jack"));
    }
}
class Person{
    String name = "jack";
    int age = 20;
    public boolean compareTo(int age,String name){
        return this.age==age&&this.name.equals(name);
    }
}
