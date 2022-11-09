package com.study.异常exception_.异常处理throws;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @date 2022/10/9&17:40
 */
public class Throws01 {
    public static void main(String[] args) {

    }
    public void f2()throws FileNotFoundException {
        /*
        1.此时的异常为FileNotFoundException的编译异常
        2.可以使用try-catch-finally来处理
        3.也可以抛出异常来处理，让调用这个方法的调用者来处理
        4.throws后面的异常类型可以是它产生的异常类型，也可以是它的异常父类 Exception
        5.throws后面也可以是异常列表，即也可以抛出多个异常
         */
        FileInputStream fileInputStream = new FileInputStream("d://aa.txt");
    }
}
