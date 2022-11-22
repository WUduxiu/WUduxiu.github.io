package com.powernode.bank.service.impl;

import com.powernode.bank.dao.AccountDao;
import com.powernode.bank.pojo.Account;
import com.powernode.bank.service.AccountService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @date 2022/11/5&10:52
 */
@Service("accountService2")
public class AccountServiceImpl2 implements AccountService {
    //@Resource默认根据名称装配byName，未指定name时使用属性名作为name 通过name还是找不到的话 就自动启动byType装配
    @Resource(name = "accountDao")
    private AccountDao accountDao;
    @Override
    public void transfer(String fromActno, String toActno, double money) {

    }
    //保存账户信息
    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void save(Account act) {
        accountDao.insert(act);
        //模拟异常
        throw new RuntimeException("模拟事务2-Impl2发生异常");
        //发生异常 下面的代码不会继续执行  代表事务还没结束
        //大括号的当中 后续可能还有别的DML语句
    }
}
