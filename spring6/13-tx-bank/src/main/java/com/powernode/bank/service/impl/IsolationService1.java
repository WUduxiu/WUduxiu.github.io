package com.powernode.bank.service.impl;

import com.powernode.bank.dao.AccountDao;
import com.powernode.bank.pojo.Account;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @date 2022/11/5&11:41
 */
@Service("i1")
public class IsolationService1 {
    @Resource(name = "accountDao")
    private AccountDao accountDao;
    //负责查询  -1号
    //添加事务
    //@Transactional(isolation = Isolation.READ_UNCOMMITTED)  //读未提交  可以读到别的事务还没有提交的数据(最低级别)
    @Transactional(isolation = Isolation.READ_COMMITTED) //读已提交 只能读到提交完成的数据
    public void getByActno(String actno){
        Account account = accountDao.selectByActno(actno);
        System.out.println("查询到的账号信息："+account);
    }


}
