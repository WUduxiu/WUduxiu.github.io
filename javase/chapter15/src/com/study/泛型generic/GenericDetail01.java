package com.study.泛型generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @date 2022/10/16&20:41
 */
public class GenericDetail01 {
    public static void main(String[] args) {
       // 1.给泛型指向数据类型只能是引用类型，不能是基本数据类型
        ArrayList<Integer> integers = new ArrayList<>();
        //2.在给泛型指定具体类型后，可以传入该类型或者其子类类型
        C<A> ac = new C<A>(new A());//这里表示C的构造器中只能放入A类 或者  A类的子类
        C<A> ac1 = new C<>(new B());//因为B是A的子类 所以编译也能通过
        //3.泛型的使用形式
        ArrayList<C> cs = new ArrayList<C>();
        List<C> cs1 = new ArrayList<C>();
        ArrayList<C> cs2 = new ArrayList<>();//后面的泛型可以省略(编译器会进行推断)  也是推荐的写法
        ArrayList list = new ArrayList();//默认的泛型就是Object
    }
}
class A{}
class B extends A{}
class C<E>{
    E c;

    public C(E c) {
        this.c = c;
        System.out.println(c.getClass());
    }
}
