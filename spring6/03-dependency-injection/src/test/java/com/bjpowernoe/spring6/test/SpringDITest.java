package com.bjpowernoe.spring6.test;

import com.bjpowernode.spring6.service.CustomerService_constructor;
import com.bjpowernode.spring6.service.UserService_set;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @date 2022/10/28&19:03
 */
public class SpringDITest {
    @Test
    //测试set注入属性
    public void testSetDI() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService_set serviceDao = applicationContext.getBean("serviceDao", UserService_set.class);
        serviceDao.saveUser();
        serviceDao.saveVip();
    }

    @Test
    //测试构造器方法注入属性(通过 构造器参数下标)
    public void testConstructorDIIndex() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring2.xml");
        CustomerService_constructor customerService = applicationContext.getBean("customerService", CustomerService_constructor.class);
        customerService.save();
    }

    @Test
    //测试构造器方法注入属性(通过 构造器参数名字)
    public void testConstructorDIName(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring2.xml");
        CustomerService_constructor cusBean = applicationContext.getBean("cusBean", CustomerService_constructor.class);
        cusBean.save();
    }
    @Test
    //测试构造器方法注入属性(不设置参数下标，也不设置参数名字 让Spring容器自动匹配)
    public void testConstructorNone(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring2.xml");
        CustomerService_constructor cusBean = applicationContext.getBean("cusBean2", CustomerService_constructor.class);
        cusBean.save();
    }
}
