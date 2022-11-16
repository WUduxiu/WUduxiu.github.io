package com.powernode.spring6.test;

import com.powernode.spring6.bean.Husband;
import com.powernode.spring6.bean.Wife;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @date 2022/10/31&15:28
 */
public class CircularDependencySetTest {
    @Test
    //测试循环依赖  singleton + setter
    public void testCdSingleton(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-singleton.xml");
        Wife wifeBean = applicationContext.getBean("wifeBean", Wife.class);
        Husband husband = applicationContext.getBean("husbandBean", Husband.class);
        System.out.println(wifeBean);
        System.out.println(husband);
    }
    @Test
    //测试循环依赖 prototype + setter
    public void testCdPrototype(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-prototype.xml");
        Wife wifeBean = applicationContext.getBean("wifeBean", Wife.class);
        Husband husband = applicationContext.getBean("husbandBean", Husband.class);
        System.out.println(wifeBean);
        System.out.println(husband);
    }
}
