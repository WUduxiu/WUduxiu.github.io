package com.powernode.myspring.test;

import com.powernode.myspring.bean.UserService;
import org.junit.Test;
import org.myspringfarmework.core.ApplicationContext;
import org.myspringfarmework.core.ClasspathXmlApplicationContext;

/**
 * @date 2022/10/31&22:58
 */
public class MySpringTest {
    @Test
    //测试MySpring能否使用
    public void testMySpring(){
        ApplicationContext applicationContext = new ClasspathXmlApplicationContext("myspring.xml");
        Object vip = applicationContext.getBean("vip");
        System.out.println(vip);
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.save();
    }
}
