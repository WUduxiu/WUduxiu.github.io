package com.powernnode.spring6.test;

import com.powernode.spring6.bean.SpringBean;
import com.powernode.spring6.factorybean.Person;
import com.powernode.spring6.factorymethod.Gun;
import com.powernode.spring6.simplefactory.Start;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @date 2022/10/30&15:41
 */
public class BeanInstantiationTest {
    @Test
    //测试bean的实例化 第一种方法  在xml文件中配置bean 通过调用bean的无参构造器完成bean的实例化
    public void testInstantiation1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        SpringBean sb = applicationContext.getBean("sb", SpringBean.class);
        System.out.println(sb);
    }
    @Test
    //测试bean的获取方式 第二种 使用简单工厂模式
    public void testInstantiation2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Start start = applicationContext.getBean("startBean", Start.class);
        System.out.println(start);
    }
    @Test
    //测试bean的第三种获取方法 使用工厂方法模式
    public void testInstantiation3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Gun gun = applicationContext.getBean("gun", Gun.class);
        System.out.println(gun);
    }
    @Test
    //测试bean的第四种获取方法 使用实现FactoryBean接口的方式来实现
    public void testInstantiation4(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Person person = applicationContext.getBean("person", Person.class);
        System.out.println(person);
    }
}
