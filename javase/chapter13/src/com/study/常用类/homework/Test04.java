package com.study.常用类.homework;

/**
 * @date 2022/10/13&10:38
 */
public class Test04 {
    public static void main(String[] args) {
        String str = "123";
        try {
            number(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void number(String str) {
        if (str == null) {
            throw new RuntimeException("输入的字符串不能为空");//如果有异常就抛出异常 下面程序不继续运行
        }
        char[] chars = str.toCharArray();
        int newCount = 0;//数字
        int lowerCount = 0;//小写
        int upperCount = 0;//大写
        int otherCount = 0;//其他字符
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= '0' && chars[i] <= '9') {
                newCount++;
            } else if (chars[i] >= 'a' && chars[i] <= 'z') {
                lowerCount++;
            } else if (chars[i] >= 'A' && chars[i] <= 'Z') {
                upperCount ++;
            }else {
                otherCount++;
            }
        }
        System.out.println("该字符串的数字有" + newCount + "个");
        System.out.println("该字符串的大写字母有" + lowerCount + "个");
        System.out.println("该字符串的小写字母有" + upperCount + "个");
        System.out.println("其他字符为"+otherCount+"个");
    }
}
