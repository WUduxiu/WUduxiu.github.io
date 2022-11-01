package com.study.注解annotation_;

/**
 * @date 2022/10/7&14:04
 */
public class Deprecated_ {
    public static void main(String[] args) {
            A a = new A();
            a.hi();
        System.out.println(a.n1);
    }
}
@Deprecated
/*
  1.@Deprecated修饰某个元素，表示该元素已经过时
  2.表示不在推荐使用，但是仍然可以继续使用
  3.@Deprecated 注解类的源代码：
  4.可以修饰类、方法、字段、包、参数 等等
  5.@Deprecated 用于版本升级的兼容过渡
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, MODULE, PARAMETER, TYPE})
public @interface Deprecated {
}
 */
class A{
    @Deprecated
    public int n1 = 10;
    @Deprecated
    public void hi(){}
}
