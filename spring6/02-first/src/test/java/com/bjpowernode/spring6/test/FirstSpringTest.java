package com.bjpowernode.spring6.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @date 2022/10/27&23:21
 */
public class FirstSpringTest {
    @Test
    public void testFirstSpringCode(){
        /*
        1.获取Spring容器对象
        Spring容器里面是怎么存储对象的？
        底层是一个Map数组
        key-value的方式  key是id  value是路径  所以id是唯一不可重复的，但是value可以重复
        ApplicationContext 翻译为：应用上下文。其实就是Spring容器
        ApplicationContext 是一个接口
        ApplicationContext 这个接口有很多的实现类， 其中有一个是实现类叫做：ClassPathXmlApplicationContext
        ClassPathXmlApplicationContext 这个实现类 专门从类路径中加载spring的配置文件的Spring上下文对象
        这行代码只要执行，就相当于启动了Spring容器，解析spring.xml文件，并且实例化所有对象，放到Spring容器中
         */
        //后面可以跟多个 .xml文件 因为
        /*
        构造器里面可以是一个可变常参数
        public ClassPathXmlApplicationContext(String... configLocations) throws BeansException {
        this(configLocations, true, (ApplicationContext)null);
        }
         */
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring.xml","beans.xml","xml/beans2.xml");
        //使用getBean方法获取 Spring容器中的对象
        Object userBean = applicationContext.getBean("userBean");
        System.out.println(userBean);
        Object userDaoBean = applicationContext.getBean("userDaoBean");
        System.out.println(userDaoBean);
        Object user1Bean = applicationContext.getBean("user1Bean");
        System.out.println(user1Bean);
        Object user2Bean = applicationContext.getBean("user2Bean");
        System.out.println(user2Bean);
        //直接返回 Date类型的对象 (获取什么类型的对象，取决于第二个参数的值)
        Date dateBean = applicationContext.getBean("DateBean", Date.class);
        //日期格式化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(dateBean));
    }
    @Test
    public void logging(){
        //自己使用log4j2记录日志信息
        //1.创建日志记录器对象
        //获取该类FirstSpringTest的日志记录器对象，也就是说只要是FirstSpringTest类中的代码执行记录日志的话，就输出相关信息
        Logger logger = LoggerFactory.getLogger(FirstSpringTest.class);
        //记录日志 根据不同的级别来输出日志
        logger.info("我是一条Info消息");
        logger.debug("我是条bug信息");
        logger.error("我是一条error信息");
    }
}
