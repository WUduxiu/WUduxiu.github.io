package com.study.抽象类abstract_.抽象类设计模板;

abstract public class Template {
    int num = 0;
    public abstract void job();
    public void calculate(){
        long start =  System.currentTimeMillis();//返回当前时间(以毫秒为单位)从1970-1-1到现在的时间
        job();//动态绑定机制
        long end = System.currentTimeMillis();
        System.out.println("执行任务的时间为"+(end-start));
    }
}
