package com.powernode.spring6.test;

import com.powernode.spring6.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @date 2022/11/2&21:44
 */
public class SpringJdbcTest_Callback {
    @Test
    //在spring写jdbc的代码 使用Callback回调函数
    public void testCallback(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        //准备sql语句
        String sql = "select id,real_name,age from t_user where id = ?";
        //注册回调函数，当execute方法执行时，回调函数中的doInPreparedStatement会被调用
        User user = jdbcTemplate.execute(sql, new PreparedStatementCallback<User>() {
            @Override
            public User doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
                User user = null;
                ps.setInt(1, 2);//参数的意义  第几个问号   问号的值
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    int id = rs.getInt("id");//表中字段属性名为 id的数据
                    String realName = rs.getString("real_name");//表中字段属性名为 real_name 的属性
                    int age = rs.getInt("age");//表中字段为属性名为 age 的数据
                    user = new User(id, realName, age);
                }
                return user;
            }
        });
        System.out.println(user);
    }
}
