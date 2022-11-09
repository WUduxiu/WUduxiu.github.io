package com.study.泛型generic.customgeneric;

/**
 * @date 2022/10/16&22:37
 */
public class CustomGeneric01 {
    public static void main(String[] args) {

    }
}
/*
1.Tiger后面就是自定义的泛型
2.T R M 就是泛型标识符，一般是单个字母大写
3.泛型标识符可以有多个
4.普通成员(属性和方法)可以使用泛型
5.使用泛型的数组不可以初始化
6.静态方法、属性不可以使用泛型
7.如果在创建对象时，没有指定泛型 默认的泛型就是Object
 */
class Tiger<T,R,M>{
    String name;
    T t;
    R r;
    M m;
    T[] ts;
    //static R m1;  因为静态是和类相关的，在类加载的时候，对象还没有创建，但是泛型却是在对象创建的时候才确定的
                    //所以当静态成员中使用了泛型，JVM机就无法完成初始化
   // T[] ts= new T[8]; 使用泛型的数组不可以初始化 因为数组在new的时候 不能确定T的类型，就无法在内存开辟空间

    public Tiger(String name, T t, R r, M m) {//构造器使用到泛型
        this.name = name;
        this.t = t;
        this.r = r;
        this.m = m;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }
}
