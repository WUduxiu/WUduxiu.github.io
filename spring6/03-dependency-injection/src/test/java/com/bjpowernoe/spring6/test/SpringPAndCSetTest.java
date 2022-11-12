package com.bjpowernoe.spring6.test;

import com.bjpowernode.spring6.bean.cbean.People;
import com.bjpowernode.spring6.bean.pbean.Dog;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @date 2022/10/29&20:26
 */
public class SpringPAndCSetTest {
    @Test
    //使用p命名空间注入属性  基于set注入，简化set注入
    public void testP() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-p.xml");
        Dog dogBean = applicationContext.getBean("dogBean", Dog.class);
        System.out.println(dogBean);
    }
    @Test
    //使用c命名空间注入属性  基于构造注入，简化构造注入
    public void testC() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-c.xml");
        People peopleBean = applicationContext.getBean("peopleBean", People.class);
        System.out.println(peopleBean);
    }
}
