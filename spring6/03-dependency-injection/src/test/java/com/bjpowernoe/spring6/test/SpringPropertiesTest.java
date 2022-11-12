package com.bjpowernoe.spring6.test;

import com.bjpowernode.spring6.jdbc.MyDateSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @date 2022/10/29&22:02
 */
public class SpringPropertiesTest {
    @Test
    public void testProperties(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-properties.xml");
        MyDateSource ds = applicationContext.getBean("ds", MyDateSource.class);
        System.out.println(ds);
    }
}
