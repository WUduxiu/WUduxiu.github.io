package com.study.泛型generic.customgeneric;

/**
 * @date 2022/10/17&11:23
 */
public class CustomMethodGenericExercise {
    public static void main(String[] args) {
        Apple<String, Integer, Double> a = new Apple<>();
        a.fly(10);
        a.fly(new Dog());
    }
}
class Apple<T,R,M>{
    public <E> void fly(E e){
        System.out.println(e.getClass().getSimpleName());//只显示类名
    }
    //public void eat(U u){}
    public void run(M m){

    }
}
class Dog{}


