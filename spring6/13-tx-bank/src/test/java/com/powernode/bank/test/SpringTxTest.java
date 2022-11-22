package com.powernode.bank.test;

import com.powernode.bank.pojo.Account;
import com.powernode.bank.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @date 2022/11/5&0:13
 */
public class SpringTxTest {
    @Test
    //测试使用spring处理事务
    public void testSpringTxTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        try {
            accountService.transfer("act-001", "act-002", 10000);
            System.out.println("转账成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    //测试事务的传播行为  @Transactional(propagation = Propagation.REQUIRED)
    public void testPropagation(){
        //获取Impl1
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        Account account = new Account("actno-003", 15000.0);
        accountService.save(account);
    }
}
