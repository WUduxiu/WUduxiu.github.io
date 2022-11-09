package com.study.reflect.bean;

/**
 * @date 2022/10/22&22:51
 */
public class 方法中的可变长度参数 {
    /*
    可变长度参数 类型...参数名例如 int...args
    一个方法中只能存在一个可变长度参数，且必须放在形参列表的最后(有且只有一个)
     */
    public static void main(String[] args) {
        m1(10,5,20);
        m2(new String[]{"我","是","中","国","人"});//也可以传入一个数组
        m2("我","是","中","国","人");
    }
    //可变长度参数可以当作一个数组来看待
    public static void m1(int...args){
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
    public static void m2(String...args){
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
    //
    public static void m(){

    }
}
