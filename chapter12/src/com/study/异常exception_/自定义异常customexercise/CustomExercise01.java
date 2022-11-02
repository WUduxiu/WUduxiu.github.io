package com.study.异常exception_.自定义异常customexercise;

/**
 * @date 2022/10/9&21:37
 */
public class CustomExercise01 {
    public static void main(String[] args) {
        Person person = new Person(520);
    }
}
/*
    一般情况下，我们自定义异常是继承RuntimeException运行类型异常 继承Exception就是编译类型异常了
    自定义成运行类型的异常，可以利用java默认的异常处理机制，比较方便
 */
class MyException extends RuntimeException{
    public MyException(String message) {
        //可以在构造器中输出自己需要打印的异常
        super(message);
    }
    public void method() throws Exception{
        /*
        throws是异常处理的一种方式
        在方法后面声明
        throws后面跟的是异常类型
         */
    }
}
class Person{
    private int age;

    public Person(int age) {
        /*
        throw和throws的区别
         */
        if (!(age>=18&&age<=120)){
            /*
            throw是手动生成异常对象的关键字
            在方法体中声明
            后面跟的是自定义的异常对象
             */
            throw new MyException("年龄需要在18-20之间");
        }
        this.age = age;
        System.out.println("年龄范围正确");
    }
}

