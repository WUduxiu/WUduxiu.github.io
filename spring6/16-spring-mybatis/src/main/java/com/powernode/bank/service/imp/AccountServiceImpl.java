package com.powernode.bank.service.imp;

import com.powernode.bank.mapper.AccountMapper;
import com.powernode.bank.pojo.Account;
import com.powernode.bank.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @date 2022/11/5&20:43
 */
@Transactional //该类中的所有方法都启动事务
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;
    @Override
    public int save(Account account) {
        return accountMapper.insert(account);
    }

    @Override
    public int deleteByActno(String actno) {
        return accountMapper.deleteByActno(actno);
    }

    @Override
    public int modify(Account account) {
        return accountMapper.update(account);
    }

    @Override
    public Account getByActno(String actno) {
        return accountMapper.selectByActno(actno);
    }

    @Override
    public List<Account> getAll() {
        return accountMapper.selectAll();
    }

    @Override
    public void transfer(String fromActno, String toActno, double money) {
        //先查询要转账的账户
        Account fromAct = accountMapper.selectByActno(fromActno);
        if (fromAct.getBalance()<money) {//判断要转账的账户里面的余额是否充足
            throw new RuntimeException("余额不足");//余额不足就抛出异常
        }
        Account toAct = accountMapper.selectByActno(toActno);
        //修改俩个账户里面的余额
        fromAct.setBalance(fromAct.getBalance()-money);
        toAct.setBalance(toAct.getBalance()+money);
        //在数据库里面更新俩个账户的余额
        int count = accountMapper.update(fromAct);
        //模拟异常
        String s = null;
        s.toString();

         count += accountMapper.update(toAct);
         if (count!=2){
             throw new RuntimeException("转账失败");
         }
    }
}
