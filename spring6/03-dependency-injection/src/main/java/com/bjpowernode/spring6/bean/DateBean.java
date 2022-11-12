package com.bjpowernode.spring6.bean;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @date 2022/10/28&21:26
 */
public class DateBean {

    public void getCommonDate(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:dd:ss");
        String format = sdf.format(date);
        System.out.println(format);
    }
}
