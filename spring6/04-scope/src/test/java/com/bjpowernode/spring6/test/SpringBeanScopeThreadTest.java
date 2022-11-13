package com.bjpowernode.spring6.test;

import com.bjpowernode.spring6.bean.SpringBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @date 2022/10/29&22:50
 */
public class SpringBeanScopeThreadTest {
    @Test
    //测试多线程的情况下实例化的bean是单例的还是多例的
    public void testScopeThread(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("spring-scope.xml");
        SpringBean sb = applicationContext.getBean("sb", SpringBean.class);
        System.out.println(sb);
        //启动新线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                SpringBean sb1 = applicationContext.getBean("sb", SpringBean.class);
                System.out.println(sb1);
            }
        }).start();
    }
}
