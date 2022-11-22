package com.powernode.bank.test;

import com.powernode.bank.pojo.Account;
import com.powernode.bank.service.impl.IsolationService1;
import com.powernode.bank.service.impl.IsolationService2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @date 2022/11/5&11:51
 */
public class SpringTestIsolation {
    @Test
    //测试事务的隔离级别
    // @Transactional(isolation = Isolation.READ_UNCOMMITTED)  读未提交  可以读到别的事务还没有提交的数据(最低级别)
    // @Transactional(isolation = Isolation.READ_COMMITTED) //读已提交 只能读到提交完成的数据
    //模拟 查询操作
    public void testIsolation1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        IsolationService1 i1 = applicationContext.getBean("i1", IsolationService1.class);
        i1.getByActno("act-004");
    }

    @Test
    //模拟新增账号信息操作
    public void testIsolation2() throws IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        IsolationService2 i2 = applicationContext.getBean("i2", IsolationService2.class);
        Account account = new Account("act-004", 100.0);
        i2.saveAct(account);
    }

}
