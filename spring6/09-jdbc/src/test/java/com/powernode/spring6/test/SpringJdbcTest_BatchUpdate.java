package com.powernode.spring6.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @date 2022/11/2&21:26
 *  批量处理数据
 */
public class SpringJdbcTest_BatchUpdate {
    @Test
    //批量添加数据
    public void testBatchInsert(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        //准备sql语句
        String sql = "insert into t_user(real_name,age) values(?,?)";
        //准备数据
        Object [] obj1 = {"小明1",31};
        Object [] obj2 = {"小明2",32};
        Object [] obj3 = {"小明3",33};
        Object [] obj4 = {"小明4",34};
        //添加到list集合中
        List<Object[]> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
        //执行sql语句
        int[] counts = jdbcTemplate.batchUpdate(sql, list);
        System.out.println(Arrays.toString(counts));
    }

    @Test
    //批量修改
    public void testBatchUpdate() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        //准备sql语句
        String sql = "update t_user set real_name = ?,age = ? where id = ?";
        //准备数据
        Object [] obj1 = {"小1",21,12};
        Object [] obj2 = {"小2",22,13};
        Object [] obj3 = {"小3",23,14};
        Object [] obj4 = {"小4",24,15};
        //添加到list集合
        List<Object[]> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
        //执行sql语句
        int[] counts = jdbcTemplate.batchUpdate(sql, list);
        System.out.println(Arrays.toString(counts));
    }

    @Test
    //批量删除
    public void testBatchDelete() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        //准备sql语句
        String sql = "delete from t_user where id = ?";
        //准备数据
        Object [] obj1 = {12};
        Object [] obj2 = {13};
        Object [] obj3 = {14};
        Object [] obj4 = {15};
        //添加到list集合
        List<Object[]> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
        //执行sql语句
        int[] counts = jdbcTemplate.batchUpdate(sql, list);
        System.out.println(Arrays.toString(counts));
    }
}
