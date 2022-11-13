package com.bjpowernode.spring6.test;

import com.bjpowernode.spring6.bean.SpringBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @date 2022/10/29&22:12
 */
public class SpringBeanScopeTest {
    @Test
    //测试spring容器管理对象 是单例还是多例(是否每次创建对象都是创建不同的对象还是同一个对象)
    public void testBeanScope() {
        /*
            1.spring默认情况下是如何管理这个Bean的
                默认情况下Bean是单例(singleton)的
                在Spring上下文启动的时候实例化
                每一次调用getBean()方法的时候，都是返回那个单例的对象
            2.当将bean的scope属性设置为 prototype的时候
                bean是多例的
                spring上下文初始化的时候，并不会初始化这些prototype的bean
                每一次调用getBean()方法的时候，才会实例化bean对象
                prototype翻译为：原型
         */
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-scope.xml");
        //new ClassPathXmlApplicationContext("spring-scope.xml"); 这个时候就已经完成调用无参构造创建对象了
        //并不是调用了applicationContext.getBean("sb", SpringBean.class); 才完成对象的创建的
        SpringBean sb = applicationContext.getBean("sb", SpringBean.class);
        System.out.println(sb);
        SpringBean sb1 = applicationContext.getBean("sb", SpringBean.class);
        System.out.println(sb1);
        SpringBean sb2 = applicationContext.getBean("sb", SpringBean.class);
        System.out.println(sb2);

    }
}
