package com.study.异常exception_.异常处理throws;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @date 2022/10/9&17:50
 */
public class  ThrowsDetail01 {
    public static void main(String[] args)/*throws ArithmeticException 默认的异常处理机制*/ {

    }
    public void f2() /*throws ArithmeticException 默认的异常处理机制*/{
        /*
        1.对于编译异常，程序必须处理，可以用try-catch  或者是throws处理
        2.对于运行时异常，程序如果没有处理，默认的方法就是throws处理
         */
        int n1 = 10;
        int n2 = 0;
        int res = n1/n2;
    }
    public static void f4()throws FileNotFoundException {
        f3();
        /*
        此时f4()方法调用了f3()方法，因为f3()方法抛出了异常，现在异常就要给调用者f4()来解决
        f4()可以也向上抛出异常或者使用 try-catch来解决异常
         */
//        try {
//            f3();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
    }
    public static void f3() throws FileNotFoundException {
        //f3()方法是编译类型异常，要求程序员必须解决
        FileInputStream fileInputStream = new FileInputStream("d://aa.txt");
    }
    public static void f5()throws RuntimeException{
        //f5()是运行异常，不要求程序员显示处理，因为有默认处理机制
    }
    public static void f6(){
        f5();
    }
}
class Father{
    public void method() throws RuntimeException{
    }
}
class Son extends Father{
    @Override
    //3.子类重写父类的方法时，对抛出异常的规定：子类重写的方法
    //所抛出的异常类型要么和父类抛出的异常一致，要么为父类抛出的异常类型的子类型
    public void method() throws ArithmeticException{//ArithmeticException是RuntimeException的子类
        super.method();
    }
}
