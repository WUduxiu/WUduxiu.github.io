package com.powernode.spring6.service;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @date 2022/11/4&22:02
 */
//目标对象
@Service("accountService")
public class AccountService {
    //转账的业务方法
    public void transfer() {
        System.out.println("银行账户正在完成转账操作");
    }

    //取款的业务方法
    public void withdraw() {
        System.out.println("银行账户正在完成取款操作");
    }

}
