package com.study.常用类.string类.stringmethod;

/**
 * @date 2022/10/10&21:26
 */
public class 获取字符串中的字符索引下标StringMethod03_indexOf {
    public static void main(String[] args) {
         //1.indexOf 获取字符在字符串对象中第一次出现的索引，索引从0开始，如果找不到返回-1
        String str = "hshjhlhlhhhsfalfa@";
        int index = str.indexOf("hj");//里面的内容也可以是字符串 不是子字符串就会返回-1
        int index2 = str.indexOf('b');
        System.out.println(index);
        System.out.println(index2);
        //2.lastIndexOf 获取字符在字符串最后一次出现的索引，索引从0开始，如果找不到返回-1
        int lastIndex = str.lastIndexOf("lh");//里面的内容也可以是字符串 不是子字符串就会返回-1
        int lastIndex2 = str.lastIndexOf('c');
        System.out.println(lastIndex);
        System.out.println(lastIndex2);
    }
}
