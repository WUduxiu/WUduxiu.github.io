package com.powernode.bank.mapper;

import com.powernode.bank.pojo.Account;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @date 2022/11/5&20:28
 */
public interface AccountMapper { //该接口的实现类不需要写 是Mybatis通过动态代理机制生成的实现类
    //这就是Dao  只要编写CRUD即可
    //新增账户
    int insert(Account account);

    //删除账户--根据账户名
    int deleteByActno(String actno);

    //修改账户
    int update(Account account);

    //查找单个账户--根据账户名返回一个账户
    Account selectByActno(String actno);

    //查找所有账户
    List<Account> selectAll();
}
