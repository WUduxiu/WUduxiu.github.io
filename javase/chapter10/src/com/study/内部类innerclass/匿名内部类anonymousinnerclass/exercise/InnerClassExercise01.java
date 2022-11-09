package com.study.内部类innerclass.匿名内部类anonymousinnerclass.exercise;

public class InnerClassExercise01 {
    public static void main(String[] args) {
        f1(new IA() {//如果只是使用一次接口里面的方法推荐使用匿名内部类
            /*
            相当于是匿名内部类实现了IA接口里面的show()方法
             */
            @Override
            public void show() {
                System.out.println("匿名对象实现了接口里面的show()方法");
            }
        });
        //传统方法
        Picture picture = new Picture();
        f1(picture);
    }
    public static void f1(IA ia){
        ia.show();
        System.out.println(ia.getClass());
    }
}
interface IA{
    void show();
}
class Picture implements IA{

    @Override
    public void show() {
        System.out.println("Picture类实现了接口里面的show()方法");
    }
}
