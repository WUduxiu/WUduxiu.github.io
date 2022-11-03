package com.study.常用类.date类;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @date 2022/10/12&21:26
 */
public class 第三代日期的时间加减Plus和minus {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        System.out.println(dateTimeFormatter.format(now.plusDays(20)));//加20天以后的日期
        System.out.println(dateTimeFormatter.format(now.minusDays(555)));//减555天以前的日期
    }
}
