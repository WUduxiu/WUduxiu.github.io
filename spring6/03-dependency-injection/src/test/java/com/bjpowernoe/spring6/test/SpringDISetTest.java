package com.bjpowernoe.spring6.test;

import com.bjpowernode.spring6.bean.SimpleValueType;
import com.bjpowernode.spring6.bean.User;
import com.bjpowernode.spring6.jdbc.MyDateSource;
import com.bjpowernode.spring6.service.DateService;
import com.bjpowernode.spring6.service.OrderService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @date 2022/10/28&20:26
 */
public class SpringDISetTest {
    @Test
    //set方法注入外部bean
    public void setOutBeanDI() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        OrderService orderServiceBean = applicationContext.getBean("orderServiceBean", OrderService.class);
        orderServiceBean.generate();
    }
    @Test
    //set方法注入内部bean
    public void setInnerBeanDI(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        OrderService orderServiceBean2 = applicationContext.getBean("orderServiceBean2", OrderService.class);
        orderServiceBean2.generate();
    }
    @Test
    //set方法注入简单类型
    public void setSimpleTypeDI(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        User user = applicationContext.getBean("userBean", User.class);
        System.out.println(user);
    }
    @Test
    //测试什么是简单的类型
    public void setDISimpleType(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        SimpleValueType svtBean = applicationContext.getBean("svtBean", SimpleValueType.class);
        System.out.println(svtBean);
    }
    @Test
    //测试java.util.Date set注入使用ref赋值
    public void setDateRef(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        DateService serviceDate = applicationContext.getBean("serviceDateBean", DateService.class);
        serviceDate.printCommonDate();
    }
    @Test
    //测试使用set注入 使Spring来管理测试源中的数据
    public void setMyDateSource(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("jdbc.xml");
        MyDateSource myDateSource = applicationContext.getBean("myDateSource", MyDateSource.class);
        System.out.println(myDateSource);
    }
}
