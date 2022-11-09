package com.study.常用类.string类.stringmethod;

/**
 * @date 2022/10/10&22:05
 */
public class 字符串分割StringMethod_split {
    public static void main(String[] args) {
        String poem = "锄禾日,当午,汗滴禾下土,谁知盘中餐,粒粒皆辛苦";
        String [] split = poem.split(",");//在poem这个字符串里面，按照(,)分割
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
        String path = "E:\\aaa\\bbb";
        String [] sp = path.split("\\\\");//在path字符串中按照\\分割 (\第一个是转义字符\)
        for (int i = 0; i < sp.length; i++) {
            System.out.println(sp[i]);
        }
    }
}
