package com.bjpowernoe.spring6.test;

import com.bjpowernode.spring6.bean.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @date 2022/10/28&22:52
 */
public class SpringDISetCollectionTest {
    @Test
    //测试属性是list  set map properties 的set注入
    public void setCollectionTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-collection.xml");
        Person personBean = applicationContext.getBean("personBean", Person.class);
        System.out.println(personBean);
    }

}
