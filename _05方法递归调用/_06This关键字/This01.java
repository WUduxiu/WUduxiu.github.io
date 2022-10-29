package _05方法递归调用._06This关键字;

public class This01 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("TOM", 3,"白色");
        System.out.println("dog1的hashcode="+dog1.hashCode());
        dog1.info();
    }

}
class Dog{
    int age;
    String name;
    String color;
    public Dog(String dName,int dAge,int b){
        //此时形参dAge dName都是可以引用Dog类里面的属性（全局变量）
        age = dAge;
        name = dName;
    }
    public Dog(String name,int age){
        //此时形参里面的name age 和下面左边的 name 和 age 都是构造器里面的 name 和 age 是局部变量
        name = name;
        age = age;
    }
    public Dog(String name,int age,String color){
        //this.name  是指当前对象属性（哪个对象调用就代表那个对象）此时就是指dog1这个对象
        //根据hashCode值来确定 this对象就是 dog1
        this.name = name;
        this.age = age;
        this.color = color;
        System.out.println("this.hashcode="+this.hashCode());
    }
    public void info(){
        System.out.println("输出的信息为：name="+name+"\t"+"age="+age+"color="+color);
    }
}
