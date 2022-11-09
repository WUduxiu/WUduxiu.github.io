package _07方法练习;

public class Test07 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.show("jack",3,"白色");
    }
}
class Dog{
    String name;
    int age;
    String color;
    public void show(String name,int age,String color){
        this.name = name;
        this.age = age;
        this.color = color;
        System.out.println("Dog的信息如下：name= "+this.name+" age= "+this.age+" color= "+this.color);
    }
}
