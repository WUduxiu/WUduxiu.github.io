package com.study.reflect.ClassforName的执行导致类加载;

/**
 * @date 2022/10/22&16:33
 */
public class Test01 {
    public static void main(String[] args) {
        try {
            // Class.forName()方法的执行 会导致类加载
            Class.forName("com.study.reflect.ClassforName的执行导致类加载.MyClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class MyClass {
    //如果只希望一个类的静态代码块执行 不希望其他代码执行可以使用 Class.forName("完整类名")
    //因为Class.forName()方法的执行 会导致类加载 类加载会执行静态代码块(只执行一次)
    //例如JDBC
    static {
        System.out.println("MyClass类的静态代码块执行了");
    }
}
