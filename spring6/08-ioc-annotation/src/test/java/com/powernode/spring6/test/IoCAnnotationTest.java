package com.powernode.spring6.test;

import com.powernode.spring6.bean.Order;
import com.powernode.spring6.bean.Student;
import com.powernode.spring6.bean.User;
import com.powernode.spring6.bean.Vip;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @date 2022/11/1&21:58
 */
public class IoCAnnotationTest {
    @Test
    //测试注解是否能被扫描到
    public void testBeanComponent(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User user = applicationContext.getBean("userBean", User.class);
        Vip vip = applicationContext.getBean("vipBean", Vip.class);
        Order order = applicationContext.getBean("orderBean", Order.class);
        Student student = applicationContext.getBean("studentBean", Student.class);
        com.powernode.spring6.bean.Test test = applicationContext.getBean("test", com.powernode.spring6.bean.Test.class);
        Object orderDao = applicationContext.getBean("orderDao");
        System.out.println(orderDao);
        System.out.println(test);
        System.out.println(user);
        System.out.println(vip);
        System.out.println(order);
        System.out.println(student);
    }
}
