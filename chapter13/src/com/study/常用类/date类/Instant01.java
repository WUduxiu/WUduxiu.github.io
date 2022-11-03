package com.study.常用类.date类;

import java.time.Instant;
import java.util.Date;

/**
 * @date 2022/10/12&21:19
 */
public class Instant01 {
    public static void main(String[] args) {
        //通过 静态方法 now() 获取当前时间戳的对象
        Instant now = Instant.now();
        System.out.println(now);
        //通过 from 可以把Instant 转成 Date
        Date date = Date.from(now);
        System.out.println(date);
        //通过 date的toInstant()，可以把date 转化成 Instant对象
        Instant instant = date.toInstant();
        System.out.println(instant);
    }
}
