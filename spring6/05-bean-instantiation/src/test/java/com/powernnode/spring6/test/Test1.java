package com.powernnode.spring6.test;

import com.powernode.spring6.factorybean.test1;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @date 2022/10/30&17:30
 */
public class Test1 {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("test.xml");
        test1 test1 = applicationContext.getBean("test1", test1.class);
        System.out.println(test1);
    }

}
