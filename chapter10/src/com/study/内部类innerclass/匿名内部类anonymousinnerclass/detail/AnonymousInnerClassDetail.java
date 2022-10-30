package com.study.内部类innerclass.匿名内部类anonymousinnerclass.detail;

public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Person person = new Person();
        person.person1Test();
        person.person2Test();
        System.out.println(person);
        System.out.println("main方法中的person运行类型"+person.getClass());
    }
}
class Person{
    private int n1 = 10;
    public void test(){
        System.out.println("Person类(父类)的方法");
    }
    public void ok(String name){
        System.out.println("接收参数"+name);
    }
    public void person1Test(){
        //有返回值的匿名内部类的调用
        //Class 匿名对象 extends Person
        Person person = new Person(){
          private int n1 = 100;
            @Override
            public void test() {
                //匿名内部类可以直接访问外部类的所有成员包括私有类
                System.out.println("匿名内部类的属性n1="+n1);
                System.out.println("外部类的私有属性n1="+Person.this.n1);
                System.out.println(Person.this);
                System.out.println("在匿名内部类Person$1中重写的test()方法");
            }
        };
        person.test();//动态绑定机制
        System.out.println("匿名对象的运行类型"+person.getClass());
    }
    public void person2Test(){
        new Person(){//匿名内部类本身也是一个返回对象
            @Override
            public void test() {
                System.out.println("在匿名内部类Person$2中重写的test()方法");
            }

            @Override
            public void ok(String name) {
                super.ok(name);
            }
        }.ok("jack");
        System.out.println();
    }

}
