package com.bjpowernoe.spring6.test;

import com.bjpowernode.spring6.jdbc.MyDateSource1;
import com.bjpowernode.spring6.jdbc.MyDateSource2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @date 2022/10/29&21:08
 */
public class SpringSetDIUtilTest {
    @Test
    public void testUtil() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-util.xml");
        MyDateSource1 sd1 = applicationContext.getBean("ds1", MyDateSource1.class);
        System.out.println(sd1);
        MyDateSource2 ds2 = applicationContext.getBean("ds2", MyDateSource2.class);
        System.out.println(ds2);
    }
}
