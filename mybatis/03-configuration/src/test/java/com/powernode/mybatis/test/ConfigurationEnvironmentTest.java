package com.powernode.mybatis.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;

/**
 * @date 2022/11/8&23:43
 */
public class ConfigurationEnvironmentTest {
    @Test
    //测试mybatis-config.xml文件里面的environments属性(配置数据库的连接)
    public void testEnvironment() throws IOException {
        //获取SqlSessionFactory对象(采用默认的方式获取)
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //这种方式是获取默认环境 <environments default="mybatisDB">
        SqlSessionFactory sqlSessionFactory =
                sqlSessionFactoryBuilder.build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行<environments default="mybatisDB">sql语句
        sqlSession.insert("car.insertCar");
        sqlSession.commit();
        sqlSession.close();

        //这种方式就是通过环境id来使用指定的环境
        //后面的参数跟一个 <environment id="mybatis2DB">
        SqlSessionFactory sqlSessionFactory2 =
                sqlSessionFactoryBuilder.build(Resources.getResourceAsStream("mybatis-config.xml"), "mybatis2DB");
        SqlSession sqlSession2 = sqlSessionFactory2.openSession();
        //执行<environment id="mybatis2DB">sql语句
        sqlSession2.insert("car.insertCar");
        sqlSession2.commit();
        sqlSession2.close();
    }
}
