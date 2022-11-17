package com.powernode.spring6.test;

import com.powernode.spring6.bean2.A;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @date 2022/11/1&22:35
 */
public class IoCAnnotationChooseTest {
    @Test
    //选择性选择标签
    public void testChooseTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-choose.xml");

    }
}
