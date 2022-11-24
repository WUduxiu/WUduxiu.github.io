package com.powernode.spring6.test;

import com.powernode.spring6.bean.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @date 2022/11/5&14:25
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:spring.xml")
public class SpringJunit5Test {
    @Autowired
    private User user;//属性注入
    @Test
    //测试Junit5里面Spring提供的支持
    public void testJunit5(){
        System.out.println(user.getName());
    }
    @Test
    public void testBD(){
        System.out.println();
    }
}
