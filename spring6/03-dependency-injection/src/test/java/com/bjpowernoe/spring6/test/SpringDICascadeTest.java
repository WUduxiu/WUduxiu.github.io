package com.bjpowernoe.spring6.test;

import com.bjpowernode.spring6.bean.Clazz;
import com.bjpowernode.spring6.bean.Student;
import jdk.swing.interop.SwingInterOpUtils;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @date 2022/10/28&22:02
 */
public class SpringDICascadeTest {
    @Test
    //测试不使用级联给属性set赋值
    public void setTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("cascade.xml");
        Student studentBean = applicationContext.getBean("studentBean", Student.class);
        Clazz clazzBean = applicationContext.getBean("clazzBean", Clazz.class);
        System.out.println(studentBean);
        System.out.println(clazzBean);
    }
    @Test
    //测试使用级联给属性set赋值
    public void setCascadeTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("cascade.xml");
        Student studentBean = applicationContext.getBean("studentBean2", Student.class);
        Clazz clazzBean = applicationContext.getBean("clazzBean2", Clazz.class);
        System.out.println(studentBean);
        System.out.println(clazzBean);
    }
}
