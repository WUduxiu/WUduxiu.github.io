package com.powernode.spring6.test;

import com.powernode.spring6.bean.User;
import com.powernode.spring6.bean.Vip;
import jdk.swing.interop.SwingInterOpUtils;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @date 2022/10/30&17:49
 */
public class BeanLifecycleTest {
    @Test
    //Bean的粗略的五步生命周期
    /*
         Spring容器只会对singleton(单例的)的Bean进行完整的生命周期管理
        如果是prototype作用域的Bean，Spring容器只会将该Bean初始化完毕，
        等客户端一旦和获取到该Bean之后(即使用了Bean之后)，Spring容器就不再管理该Bean的生命周期了
     */
    public void testLifecycleFive(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User user = applicationContext.getBean("user", User.class);
        ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) applicationContext;
        System.out.println("第六步：使用Bean："+user);
        //必须手动关闭spring容器，这样spring容器才会销毁bean
        context.close();
    }
    @Test
    //将自己半路上new的对象纳入Spring容器来管理
    public void testRegisterBean(){
        //自己new的对象
        Vip vip = new Vip();
        System.out.println(vip);
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        factory.registerSingleton("vipBean",vip);
        //从Spring容器中获取
        Object vipBean = factory.getBean("vipBean");
        System.out.println(vipBean);
    }
}
