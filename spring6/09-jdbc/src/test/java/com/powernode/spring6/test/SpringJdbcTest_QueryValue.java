package com.powernode.spring6.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @date 2022/11/2&21:20
 */
public class SpringJdbcTest_QueryValue {
    @Test
    //查询表中的单个值
    public void testQueryOneValue(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        //准备sql语句
        String sql = "select count(1) from t_user";//返回总记录条数是一个整数数字  int类型  字段为id的条数
        Integer total = jdbcTemplate.queryForObject(sql, int.class);
        System.out.println("总记录条数："+total);
    }
}
