package com.study.注解annotation_;

/**
 * @date 2022/10/7&13:48
 */
public class Override_ {
  public static void main(String[] args) {

  }
}
class Father{
  public void fly(){
   System.out.println("父类的fly()方法");
  }
}
class Son extends Father{
    /*
    @Target(ElementType.METHOD) 是一个元注解：修饰注解的注解
        ElementType.METHOD表示只能放在方法上
    @Retention(RetentionPolicy.SOURCE)
    public @interface Override {
    这里面 @interface 表示的不是接口的意思， 表示是一个注解类
   }

     */
    @Override//只能修饰方法，该注解放在子类fly()方法上，表示子类的fly()方法是重写了父类的fly()方法
    public void fly() {
        System.out.println("子类继承父类后重写的fly()方法");
    }
    //@Override
    /*
    写了@Override之后，编译器就会去检查该方法是否真的重写了父类的方法
         如果真的重写了父类的方法则编译通过，如果没有则编译错误，报错
     */
    public void say(){}
}
