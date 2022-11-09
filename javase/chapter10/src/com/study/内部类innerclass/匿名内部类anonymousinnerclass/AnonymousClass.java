package com.study.内部类innerclass.匿名内部类anonymousinnerclass;

public class AnonymousClass {//其他外部类
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();//传统方法--基于接口的匿名内部类
        outer04.newMethod();//使用匿名对象方法--基于接口的匿名内部类
        outer04.fatherTest();

    }
}
class Outer04{//外部类
    private int n1 = 10;
    public void method(){
        /*
        基于接口的匿名内部类
        1.需求：想使用IA接口，并创建对象
        2.传统方法:写一个类去实现该接口的方法，并创建该类的对象去调用方法
        例如Tiger类的使用
         */
        Tiger tiger = new Tiger();
        tiger.cry();
    }
    public void newMethod(){
        /*
        jdk底层在创建匿名内部类 Outer04$1,立即就创建了一个Outer04$1实例，并把地址赋给了tiger
        匿名内部类只能使用一次，就不能再使用  但是tiger对象可以多次使用
         */
       IA tiger = new IA(){
           /*
           此时编译类型是左边的IA接口
           运行类型是匿名对象类 = 外部类的名称$1 = Outer04$1 底层分配的类名
           底层代码：
           Class 匿名内部类(Outer04$1) implements IA{
                        @Override
                    public void cry() {
                    System.out.println("匿名内部类创建方法的实现");
               }
             }
            */
            @Override
            public void cry() {
                /*
                现在需求是Tiger类仅仅使用一次，后面不再使用，创建一个类十分不适合
                要求在不创建类的情况下，实现接口里面的方法
                可以使用匿名内部类
                 */
                System.out.println("匿名内部类创建方法的实现");
            }
        };
        System.out.println(tiger.getClass());//使用对象名.getClass()看该对象的运行类型
           tiger.cry();
           tiger.cry();
           tiger.cry();
    }
    public void fatherTest(){
        /*
         编译类型是Father  运行类型是匿名内部类Outer$2
         Class 匿名内部类(Outer04$2) extends Father{ 匿名内部类继承
                        @Override
                    public void test() {
                    System.out.println("使用匿名内部类重写test()方法");
               }
             }
         */
        Father father = new Father("jack"){
            @Override//重写Father类中的test方法
            public void test() {
                System.out.println("使用匿名内部类重写test()方法");
            }
        };
        father.test();//动态绑定机制
        System.out.println(father.getClass());
    }
    public void sonTest(){
     Son son = new Son(){

         @Override
         void test() {
             System.out.println("匿名内部类实现了抽象类Son的test()方法");
         }
     };
     son.test();//动态绑定机制
    }
}
interface IA{
    public void cry();
}
class Tiger implements IA{

    @Override
    public void cry() {
        System.out.println("普通方法的实现");
    }
}
class Father{
    public Father(String name) {
        System.out.println("接收到name="+name);
    }

    public void test(){
    }
}
abstract class Son{//抽象类
    abstract void test();//方法用abstract修饰
}
