package com.study.常用类.date类;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @date 2022/10/12&20:51
 */
public class 第三代日期LocalDate {
    public static void main(String[] args) {
        /*
        前两代日期类的不足
        1.可变性:像日期和时间这样的类应该是不可变的
        2.偏移性：Date中的年份是从1900年开始，月份都是0开始的
        3.格式化：格式化只对Date有用，Calendar则不行
        4.此外，他们的线程也不是安全的，不能处理闰秒(每隔两天，多出一秒)
        在jdk8以后加入
        LocalDate(只包含年月日) LocalTime(只包含时分秒) LocalDateTime(包含日期和时间)
         */
        //使用DateTimeFormatter  对其默认日期格式化
        LocalDateTime localDate = LocalDateTime.now();
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH小时mm分钟ss秒");
        String s = sdf.format(localDate);
        System.out.println(s);


        System.out.println(localDate);
        System.out.println("年="+localDate.getYear());
        System.out.println("月="+localDate.getMonth());//输出英文
        System.out.println("月="+localDate.getMonthValue());//输出数字
        System.out.println("日="+localDate.getDayOfMonth());
        System.out.println("时="+localDate.getHour());
        System.out.println("分="+localDate.getMinute());
        System.out.println("秒="+localDate.getSecond());
        System.out.println(date);
        System.out.println(time);
        //使用
    }
}
