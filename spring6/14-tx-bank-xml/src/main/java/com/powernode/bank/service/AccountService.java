package com.powernode.bank.service;

import com.powernode.bank.pojo.Account;

/**
 * @date 2022/11/4&23:48
 *  业务接口
 *  事务就是在这个接口下控制的
 */
public interface AccountService {
    //转账业务方法  从哪个账号 转多少前 转到那个账户上面
    void transfer(String fromActno,String toActno,double money);


}
