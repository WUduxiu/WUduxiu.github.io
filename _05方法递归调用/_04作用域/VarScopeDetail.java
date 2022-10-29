package _05方法递归调用._04作用域;


public class VarScopeDetail {
    public static void main(String[] args) {
        Person person = new Person();
        person.say();
    }
}
class Person{
    String name = "jack";//属性的生命周期较长，随着对象的创建而创建，伴随着对象的销毁而销毁

    public void say(){
        //局部变量的生命周期较短，随着它的代码块的执行而创建，伴随着代码块的结束而销毁，即在一次方法的调用过程中
        String name = "king";//属性和局部变量可以重名 遵循就近原则  此时局部变量靠近 输出name=king
        System.out.println("say()方法输出"+name);
    }
    public void hi(){
        String address = "北京";
        String name = "小明";//在不同的方法 可以重名
    }
}
class T {
    public  int age = 20;//属性（全局变量）可以加修饰符 局部变量不可以加修饰符（public private proctected....)
    public static void main(String[] args) {
        int age = 20;
        Person person = new Person();
        System.out.println(person.name);//全局变量可以可以被本类使用 也可以被其他类调用
        T t = new T();
        t.test(person);//通过对象来调用
    }
    public void test(Person person){
        System.out.println(person.name);
    }

}
