package com.powernode.spring6.factorybean;

import java.util.Date;

/**
 * @date 2022/10/30&16:42
 */
public class Student {
    //在Spring中 Date是一个简单类型 但是简单类型的话，对注入的日期格式有要求
    // Date在Spring中也可以被当成非简单类型 用ref赋值
    private Date birthday;

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Student{" +
                "birthday=" + birthday +
                '}';
    }
}
