package com.powernode.bank.service;

import com.powernode.bank.pojo.Account;

import java.util.List;

/**
 * @date 2022/11/5&20:38
 */
public interface AccountService {
    //新增账户信息
    int save(Account account);

    //通过账户名删除账户信息
    int deleteByActno(String actno);

    //修改账户信息
    int modify(Account account);

    //根据账户名查找单个账户信息
    Account getByActno(String actno);

    //获取所有账户信息
    List<Account> getAll();

    //转账
    void transfer(String fromActno,String toActno,double money);

}
