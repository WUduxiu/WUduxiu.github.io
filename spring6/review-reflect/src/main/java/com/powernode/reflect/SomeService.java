package com.powernode.reflect;

/**
 * @date 2022/10/31&17:05
 */
public class SomeService {
    public void doSome() {
        System.out.println("doSome方法执行");
    }
    public String doSome(String s){
        System.out.println("public String doSome(String s)方法执行");
        return s;
    }
    public String doSome(String s,int i){
        System.out.println("public String doSome(String s,int i)方法执行");
        return s + i;//字符串和int类型 连起来 返回新的字符串 String
    }
}
