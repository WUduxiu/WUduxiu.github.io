package com.powernode.spring6.test;

import com.powernode.spring6.bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @date 2022/11/5&14:16
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class SpringJunit4Test {
    @Autowired
    private User user;//注入属性
    @Test
    //以前的测试方式
    public void testOld(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);
    }

    //引入注解后，简化测试方法里面的步骤
    //1.不用每次都通过解析xml去 getBean
    //2.也不用每次都通过 getBean("id",class)去获取对象
    @Test
    public void testNew(){
        System.out.println(user.getName());
    }

}
