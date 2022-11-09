package com.study.常用类.homework;

import java.util.Arrays;

/**
 * @date 2022/10/12&21:34
 */
public class Test01 {
    public static void main(String[] args) {
        String str = "abcdef";
        System.out.println("交换前"+str);
        try {
             str = reverse(str, 1, 5);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;//直接跳出该方法 由于catch代码块还没执行完 就不会继续输出下面的代码了
        }
        System.out.println("交换后"+str);
    }

    public static String reverse(String str, int start, int end) {
        /*
        对传入的参数进行验证
        取反操作
        1.先写出正确的qingk
        2.直接取反即可
         */
        if(!(str!=null&&start>=0&&end>=start&&end<=str.length())){
           throw  new RuntimeException("参数输入有误");
        }

        char[] chars = str.toCharArray();//将字符串转换成数组
        char temp = '0';
        for (int i = start,j = end;i < j ; i++,j--) {//这里进行判断如果 i>=j 就停止交换
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars);//使用chars 重新构建一个String 返回
    }
}
