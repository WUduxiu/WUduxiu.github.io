package _05方法递归调用._05构造器;

public class ConstructorDetail02 {
    public static void main(String[] args) {
        Dog dog = new Dog();//此时使用的是默认的构造器


    }
}
class Dog{
    /*
    如果没有自定义构造器，系统会自动生成一个默认的无参构造器（也叫默认构造器）
    可以使用 javap -c 加 类名 反编译查看
    *默认构造器
    Dog(){

        }
     */
    //一旦自定义了构造器 给了其形参 则默认构造器就被覆盖了，就不能再使用默认构造器了
    //除非显式的自定义一下
    Dog(){//默认构造器

    }

    Dog(String dName){//自定义的构造器 （带有String 类型的形参）

    }

}
