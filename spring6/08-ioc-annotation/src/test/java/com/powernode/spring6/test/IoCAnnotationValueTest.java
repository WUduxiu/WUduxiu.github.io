package com.powernode.spring6.test;

import com.powernode.spring6.bean3.MyDateSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @date 2022/11/1&23:09
 */
public class IoCAnnotationValueTest {
    @Test
    //测试使用@Vaule注解 给简单类型属性赋值
    public void testDIByAnnotation(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-di-annotation.xml");
        MyDateSource myDateSource = applicationContext.getBean("myDateSource", MyDateSource.class);
        System.out.println(myDateSource);
    }

}
