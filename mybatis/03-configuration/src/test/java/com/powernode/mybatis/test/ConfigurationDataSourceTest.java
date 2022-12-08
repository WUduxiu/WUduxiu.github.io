package com.powernode.mybatis.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;

/**
 * @date 2022/11/9&22:31
 */
public class ConfigurationDataSourceTest {
    @Test
    //测试mybatis属性配置文件中的DataSource属性的配置
    public void testDataSource() throws IOException {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //使用默认Environment下配置的数据库配置
        //其中DataSource=UNPOOLED(不使用连接池的方式)
        SqlSessionFactory sqlSessionFactory =
                sqlSessionFactoryBuilder.build(Resources.getResourceAsStream("mybatis-config.xml"));
   /*     //sqlSessionFactory 一个数据库一个，不要频繁的创建该对象。
        //通过sqlSessionFactory对象可以开启多个会话
        //会话1
        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        //执行sql语句
        sqlSession1.insert("car.insertCar");
        sqlSession1.commit();
        sqlSession1.close();
        //会话2
        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        //执行sql语句
        sqlSession2.insert("car.insertCar");
        sqlSession2.commit();
        sqlSession2.close();*/

        for (int i = 0; i < 4; i++) {
            SqlSession sqlSession = sqlSessionFactory.openSession();
            sqlSession.insert("car.insertCar");
            //不用关闭sqlSession  这里使用连接池中的多个连接对象
            //当超过设置的连接池的最大可活动连接时  会进行等待  等待的时间可以设置
            //Waiting as long as 20000 milliseconds for connection.
        }

    }
}
