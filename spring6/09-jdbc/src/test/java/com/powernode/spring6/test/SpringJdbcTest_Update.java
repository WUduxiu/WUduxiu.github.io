package com.powernode.spring6.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @date 2022/11/2&20:54
 */
public class SpringJdbcTest_Update {
    @Test
    //测试spring6里面的jdbc模块的使用
    public void testJdbc(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        System.out.println(jdbcTemplate);
    }
    @Test
    //测试新增数据功能 insert
    public void testInsert(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        //准备sql语句
        String sql = "insert into t_user(real_name,age) values(?,?)";
        //在JdbcTemplate中，只要是 insert、delete、update 语句的，都是调用 update方法
        int count = jdbcTemplate.update(sql, "jack", 22);//返回受影响的行数  1表示正常
        System.out.println(count==1 ? "添加成功": "添加失败");
    }

    @Test
    //测试修改数据功能 update
    public void testUpdate() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        //准备sql语句
        String sql = "update t_user set real_name = ?,age = ?  where id = ?";
        int count = jdbcTemplate.update(sql, "张三丰", 50, 1);
        System.out.println(count==1 ? "修改成功": "修改失败");
    }

    @Test
    //测试删除数据功能 delete
    public void testDelete() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        //准备sql语句
        String sql = "delete from t_user where id = ?";
        int count = jdbcTemplate.update(sql, 3);
        System.out.println(count==1 ? "删除成功": "删除失败");
    }
}
