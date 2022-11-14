package com.powernnode.spring6.test;

import com.powernode.spring6.factorybean.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @date 2022/10/30&16:45
 */
public class DateTest {
    @Test
    //测试注入Date属性
    public void testDate(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-date.xml");
        Student student = applicationContext.getBean("student", Student.class);
        System.out.println(new Date());
        System.out.println(student);
    }
    @Test
    public void test() throws ParseException {
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        Date date = s.parse("2002-01-13");
        System.out.println(date);
    }

}
