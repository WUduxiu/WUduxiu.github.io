package com.study.注解annotation_;

import java.util.ArrayList;
import java.util.List;

/**
 * @date 2022/10/7&14:14
 */
@SuppressWarnings({"rawtypes","unchecked","unused"})
public class 抑制编译警告SuppressWarnings_ {
    @SuppressWarnings({"rawtypes","unchecked","unused"})//可以在里面写希望抑制的警告类型 all抑制代表所有警告
    //关于@SuppressWarnings放置的位置 这个注解现在放在main方法上面 ，作用范围就是main方法上
    //通常将@SuppressWarnings注解放在具体的语句，方法，类 上面
    /*
    源码解读：
    @Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE, MODULE})//表示可以抑制的类型
    @Retention(RetentionPolicy.SOURCE)
    public @interface SuppressWarnings {

    String[] value();//可以接收的数组比如：{"rawtypes","unchecked","unused"}
}
     */
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("0");
        list.add("1");
        list.add("2");
        int i;
        System.out.println(list.get(2));
    }
}
