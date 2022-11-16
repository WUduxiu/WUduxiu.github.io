package com.powernode.spring6.test;

import com.powernode.spring6.bean2.Husband;
import com.powernode.spring6.bean2.Wife;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @date 2022/10/31&16:23
 */
public class CircularDependencyConsTest {
    @Test
    //测试使用构造注入 实现循环依赖
    public void testCdCons(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-constructor.xml");
        Wife wifeBean = applicationContext.getBean("w", Wife.class);
        Husband husbandBean = applicationContext.getBean("h", Husband.class);
        System.out.println(wifeBean);
        System.out.println(husbandBean);
    }
}
