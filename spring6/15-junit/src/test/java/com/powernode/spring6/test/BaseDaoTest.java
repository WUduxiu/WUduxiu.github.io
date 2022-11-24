package com.powernode.spring6.test;

import com.powernode.spring6.bean.BaseDao;
import com.powernode.spring6.bean.Spring6Config;
import com.powernode.spring6.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @date 2022/11/6&16:11
 */
public class BaseDaoTest {
    @Test
    public void testBaseDao(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring6Config.class);
        BaseDao baseDao = applicationContext.getBean("baseDao", BaseDao.class);
        String sql = "select * from t_user where name = ?";
        User user = BaseDao.SelectOne(User.class, sql, "jack");
        System.out.println(user);
    }
}
