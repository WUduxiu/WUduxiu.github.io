package com.study.常用类.date类;

import java.util.Calendar;

/**
 * @date 2022/10/12&20:28
 */
public class 第二代日期Calendar01 {
    public static void main(String[] args) {
         /*
         1.Calendar是一个抽象类，并且构造器是protected
         2.可以通过 getInstance()来获取实例
         3.提供大量的方法和字段提供给程序员
          */
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        //获取日历对象的某个日历字段
        System.out.println("年:"+c.get(Calendar.YEAR));
        //为什么月份要+1 因为Calendar 返回月份的时候，是按照 0 开始编号的
        System.out.println("月:"+(c.get(Calendar.MONTH)+1));
        System.out.println("日:"+c.get(Calendar.DAY_OF_MONTH));
        System.out.println("12小时的小时时间"+c.get(Calendar.HOUR));
        System.out.println("24小时的小时时间"+c.get(Calendar.HOUR_OF_DAY));//24小时
        System.out.println("分:"+c.get(Calendar.MINUTE));
        System.out.println("秒:"+c.get(Calendar.SECOND));
        //Calendar没有固定格式 可以自己组合
        System.out.println(c.get(Calendar.YEAR)+"年-"+(c.get(Calendar.MONTH)+1)+"月");
    }
}
