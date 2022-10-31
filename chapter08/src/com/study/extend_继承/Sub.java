package com.study.extend_继承;
//ctlr + h 可以看到类的继承关系
public class Sub extends Base{
    public Sub(){
        this("123");
        //super()在使用时必须放在第一行  所以 在同一个构造器里面 不能同时存在俩个方法
       // super();//默认调用父类的无参构造器  被省略了
        //创建一个新的对象 sub，此时会调用其构造器 同时也会调用父类构造器
        //子类必须调用父类构造器，完成父类构造器的初始化
        /*
        1.当创建子类对象时，不管使用子类的那个构造器，默认情况下总会调用父类的无参构造器
        2.如果父类没有提供无参构造器，则必须在子类的构造器中用super()去指定使用父类的哪个构造器完成对父类的初始化工作
        否则编译不能通过
         */
        System.out.println("子类的无参构造器Sub()..被调用");
    }
    public Sub(String name){
        super("2");
        System.out.println("子类的有参构造器Sub(String name)..被调用");
        System.out.println(name);
        System.out.println("Sub2");
    }
    public void sayOk(){//子类私有的方法
        //子类继承父类 无法直接访问修饰符为private的属性或者方法
        //可以在父类提供一个公共的方法 来返回private的属性
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println("通过父类提供的公共方法得到的private修饰的属性"+getN4());
        test100();//相当于是直接引用本类的方法
        test200();
        test300();
        callTest400();
    }

}
