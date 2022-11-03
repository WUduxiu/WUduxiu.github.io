package com.study.常用类.date类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 * @date 2022/10/12&20:02
 */
public class 第一代日期Date01 {
    public static void main(String[] args) throws ParseException {
        // 引入java.util.Date  默认是国外的时间格式
        Date date = new Date();//获取当前系统时间
        System.out.println(date);
        Date date1 = new Date(555555);//通过指定毫秒数得到距离1970-1-1后的时间
        System.out.println(date1);
        /*
        创建SimpleDateFormat 可以指定相应的格式
         */
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String  s  = simpleDateFormat.format(date);
        String s1 = simpleDateFormat.format(date1);
        System.out.println(s);
        System.out.println(s1);
        //还可以把一个格式化的Sting 转换对应的Date
        String newDate = "2022年10月12日 08:26:43 星期三";
        Date parse = simpleDateFormat.parse(newDate);//抛出异常
        System.out.println(parse);
    }
}
