package com.bjpowernoe.spring6.test;

import com.bjpowernode.spring6.service.CustomerService_constructor;
import com.bjpowernode.spring6.service.OrderService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @date 2022/10/29&21:24
 */
public class SpringSetDIAutoWireTest {
    @Test
    //测试自动装配ByName
    public void testAutoWireByName(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-autowire.xml");
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        orderService.generate();
    }
    @Test
    //测试自动装配ByType
    public void testAutoWireByType(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-autowire.xml");
        CustomerService_constructor csService = applicationContext.getBean("csService", CustomerService_constructor.class);
        csService.save();
    }
}
