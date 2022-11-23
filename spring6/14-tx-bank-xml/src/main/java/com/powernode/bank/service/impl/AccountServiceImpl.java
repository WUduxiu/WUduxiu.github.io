package com.powernode.bank.service.impl;

import com.powernode.bank.dao.AccountDao;
import com.powernode.bank.pojo.Account;
import com.powernode.bank.service.AccountService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @date 2022/11/4&23:51
 */
@Service("accountService")
//@Transactional//对整个类里面的方法都控制事务
public class AccountServiceImpl implements AccountService {
    @Resource(name = "accountDao")//注入属性
    private AccountDao accountDao;

    //控制事务   因为在这个方法中要完成所有的转账业务
    @Override
    @Transactional //对该方法控制事务
    public void transfer(String fromActno, String toActno, double money) {
        //1.查询转出账户的余额是否充足
        Account fromAct = accountDao.selectByActno(fromActno);
        if (fromAct.getBalance() < money) {
            throw new RuntimeException("余额不足");
        }
        //余额充足
        Account toAct = accountDao.selectByActno(toActno);

        //先修改内存中的两个对象的余额
        fromAct.setBalance(fromAct.getBalance() - money);
        toAct.setBalance(toAct.getBalance() + money);

        //数据库更新
        int count = accountDao.update(fromAct);
        //模拟异常
       /* String s = null;
        s.toString();*/

        count+= accountDao.update(toAct);
        if (count!=2) {
            throw new RuntimeException("转账失败,联系银行");
        }
    }


}
