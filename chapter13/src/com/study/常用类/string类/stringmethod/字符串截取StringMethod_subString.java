package com.study.常用类.string类.stringmethod;

/**
 * @date 2022/10/10&21:33
 */
public class 字符串截取StringMethod_subString {
    public static void main(String[] args) {
        //subString() 截取指定范围的子串
        String name = "hello,java";
        System.out.println(name.substring(6));//输出java 表示从第6个索引开始截取(索引从0开始)
        System.out.println(name.substring(2,5));//相当于[2,5) 前闭后开  (索引从0开始)
    }
}
