package com.bjpowernode.spring6.service;

import com.bjpowernode.spring6.bean.DateBean;

import java.util.Date;

/**
 * @date 2022/10/28&21:29
 */
public class DateService {
    private DateBean dateBean;
    private Date date;
    public void setDateBean(DateBean dateBean) {
        this.dateBean = dateBean;
    }

    public void printCommonDate(){
        dateBean.getCommonDate();
    }

}
