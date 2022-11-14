package com.powernode.spring6.factorybean;

import org.springframework.beans.factory.FactoryBean;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @date 2022/10/30&16:50
 */
public class DateFactoryBean implements FactoryBean<Date> {
    private String strDate;

    public DateFactoryBean(String strDate) {
        this.strDate = strDate;
    }

    @Override
    public Date getObject() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //通过SimpleDateFormat的sdf.parse(strDate) 方法  将一个字符串规定好格式 返回一个Date类型的对象
        Date date = sdf.parse(strDate);
        return date;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
