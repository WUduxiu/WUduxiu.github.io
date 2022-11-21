package com.powernode.spring6.test;

import com.powernode.spring6.biz.UserService;
import com.powernode.spring6.biz.VipService;
import com.powernode.spring6.service.AccountService;
import com.powernode.spring6.service.OrderService;
import com.powernode.spring6.service.Spring6Config;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @date 2022/11/4&22:40
 */
public class AOPRealAppTest {
    @Test
    //测试银行转账事务的AOP面向对象编程
    public void testTransaction(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring6Config.class);
        /*ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");*/
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        accountService.transfer();
        accountService.withdraw();
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        orderService.generate();
        orderService.cancel();
    }
    @Test
    //测试安全日志的AOP面向对象编程
    public void testSecurityLog(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring6Config.class);
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.getUser();
        userService.saveUser();
        userService.deleteUser();
        userService.modifyUser();
        VipService vipService = applicationContext.getBean("vipService", VipService.class);
        vipService.getVip();
        vipService.saveVip();
        vipService.deleteVip();
        vipService.modifyVip();


    }
}
