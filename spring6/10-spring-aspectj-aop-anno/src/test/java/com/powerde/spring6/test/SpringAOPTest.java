package com.powerde.spring6.test;

import com.powernode.spring6.service.OrderService;
import com.powernode.spring6.service.Spring6Config;
import com.powernode.spring6.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @date 2022/11/4&20:34
 */
public class SpringAOPTest {
    @Test
    //测试Aspectj 框架里面的基于注解的面向切面编程
    public void testBefore(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
       /* UserService userService = applicationContext.getBean("userService", UserService.class);
        //测试目标对象1的目标方法1
        userService.login();
        //测试目标对象1的目标方法2
        userService.logout();
        //测试目标对象2*/
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        orderService.generate();
    }
    @Test
    //测试全注解 面向切面对象编程
    public void testNoXMLAOP(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring6Config.class);
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        orderService.generate();
    }
}
