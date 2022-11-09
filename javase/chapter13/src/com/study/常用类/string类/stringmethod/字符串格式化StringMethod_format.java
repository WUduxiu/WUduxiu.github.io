package com.study.常用类.string类.stringmethod;

/**
 * @date 2022/10/10&22:23
 */
public class 字符串格式化StringMethod_format {
    public static void main(String[] args) {
        String name = "jack";
        int age = 10;
        double score = 98.3/3;
        char gender ='男';
        String info = "名字"+ name + "年龄" + age + ",成绩是" + score + "性别是" + gender + "谢谢大家";
        System.out.println(info);

        /*
        1.%s 表示后面由字符串来替换
        2.%d 表示后面由整数来替换
        3.%.2f 表示后面由小数来替换，替换后只会保留小数点后俩位，并且进行四舍五入处理
        4.%c 表示后面由 char 类型来替换
         */
        String formatStr = "名字%s 年龄%d 成绩%.3f 性别%c 谢谢大家";
        String newInfo =String.format(formatStr,name,age,score,gender);
        System.out.println(newInfo);
    }
}
