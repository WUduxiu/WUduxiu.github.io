package _04面向对象编程;

public class _06成员方法细节 {
    public static void main(String[] args) {
        //1.在同一个类里面方法可以直接进行调用
        A a = new A();
        a.sayOK();
        System.out.println("---------------");
        //2.跨类调用，需要通过对象名进行调用
        B b = new B();
        b.sayHello();

    }
}
    class A{
        public void sayOK(){
            System.out.println("开始执行sayok方法");
            print();
            System.out.println("sayok()方法执行完毕");
        }
        public void print(){
            System.out.println("方法被执行");
            System.out.println("打印ok");
            System.out.println("方法执行完毕");
        }
    }
    class B{
        public void sayHello(){
            System.out.println("开始执行B类的sayHello方法");
            //跨类调用，需要通过对象名进行调用
            A a = new A();//先创建对象
            a.print();//调用方法
            System.out.println("sayHello（）执行完毕");
        }
    }
