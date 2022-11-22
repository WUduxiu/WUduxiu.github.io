package com.powernode.bank.service.impl;

import com.powernode.bank.dao.AccountDao;
import com.powernode.bank.pojo.Account;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

/**
 * @date 2022/11/5&11:42
 */
@Service("i2")
public class IsolationService2 {
    @Resource(name = "accountDao")
    private AccountDao accountDao;
    //负责新增数据 -2号

    //添加事务
    //readOnly = true  启动只读服务 只执行查询语句 insert  update delete 均不执行
    //可以告诉Spring框架 可以启动查询的优化策略了，以提高select语句的执行效率
    //@Transactional(readOnly = true,timeout = 10)  //设置事务超时时间为10s   执行最后一条DML语句+前面所花费的时间
    //@Transactional(rollbackFor = RuntimeException.class)//只有遇到RuntimeException和其子类 才会回滚事务
    @Transactional(noRollbackFor = RuntimeException.class)//遇到NullPointerException不会回滚事务  其他异常回滚事务
    public void saveAct(Account account) throws RuntimeException, IOException {
        accountDao.insert(account);
        //执行完DML语句之后 再进行的睡眠  下面的睡眠不算超时时间  因为下面没有DML语句了
        //睡眠20s   20s只会数据才会提交到数据库中  这样读未提交就可以读到还未提交的数据了-----脏读
       /* try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        //此时睡眠时间不会算入事务超时时间  如果想把睡眠时间也加入事务超时时间
        //可以在 执行睡眠代码下面加一条无关紧要的DML语句
        //                            DML语句
        if (1==1){
            throw new IOException();
        }

    }

}
