package com.bjpowernoe.spring6.test;

import com.bjpowernode.spring6.bean.SetNull;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @date 2022/10/28&23:19
 */
public class SpringDISetNullTest {
    @Test
    //测试注入null 和 空字符串
    public void setNullTest(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("spring-null.xml");
        SetNull nullBean = applicationContext.getBean("nullBean", SetNull.class);
        System.out.println(nullBean);
    }
}
