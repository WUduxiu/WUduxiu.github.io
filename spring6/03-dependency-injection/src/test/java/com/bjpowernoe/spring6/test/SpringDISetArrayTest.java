package com.bjpowernoe.spring6.test;

import com.bjpowernode.spring6.bean.Jack;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @date 2022/10/28&22:39
 */
public class SpringDISetArrayTest {
    @Test
    public void testSetDIArray(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-array.xml");
        Jack jack = applicationContext.getBean("jackBean", Jack.class);
        System.out.println(jack);
    }
}
