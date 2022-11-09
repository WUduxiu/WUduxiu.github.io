package com.study.extend_继承.exercise;

public class ExtendsExercise02 {
    public static void main(String[] args) {
        Three three = new Three();
    }
}
class One{
    public One(){
        System.out.println("我是A类");
    }

}
class Two extends One{
    public Two(){
        System.out.println("我是B类的无参构造");
    }
    public Two(String name){
        System.out.println(name+"我是B类的有参构造");
    }
}
class Three extends Two{
   public Three(){
        this("hello");
       System.out.println("我是C类的无参构造");
    }
    public Three(String name){
       super("hahah");
        System.out.println("我是C类的有参构造");
        System.out.println(name);
    }
}
