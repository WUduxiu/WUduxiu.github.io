package com.powernode.spring6.test;

import com.powernode.spring6.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @date 2022/11/4&21:52
 */
public class SpringAOPTest {
    @Test
    //测试spring框架 里面的aspectj框架里面的aop编程 基于XML
    public void testXMLAOP(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.logout();
    }
}
