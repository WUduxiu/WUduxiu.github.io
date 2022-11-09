package com.study.泛型generic;

/**
 * @date 2022/10/16&20:06
 */
public class Generic03 {
    public static void main(String[] args) {
        Person<String> person = new Person<String>("张三");
        person.t();

    }
}
class Person<E>{
    E s;//String s  E表示s的数据类型，该数据类型在定义Person类的时候指定
        //即在编译期间就确定E是上面类型了

    public Person(E s) {//E也可以是参数类型
        this.s = s;
    }
    public E f(){
        return s;  //返回类型也是E
    }
    public void t(){//输出s的运行类型
        System.out.println(s.getClass());
    }
}
