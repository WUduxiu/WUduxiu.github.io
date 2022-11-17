package com.powernode.spring6.test;

import org.junit.Test;
import org.powernode.service.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @date 2022/11/1&23:35
 */
public class IoCAnnotationAutoWiredTest {
    @Test
    //测试 @AutoWried注入非简单属性
    public void testAutoWried(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-autowired.xml");
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        orderService.generate();
    }
}
