package com.powernode.bank.dao;

import com.powernode.bank.pojo.Account;

/**
 * @date 2022/11/4&23:38
 *  Dao只执行sql语句
 *  也就是说Dao 和业务不挂钩
 */
public interface AccountDao {  //负责账户信息的  crud
    //根据账号查询账户信息
    Account selectByActno(String actno);

    //更新账户信息
    int update(Account act);

}
