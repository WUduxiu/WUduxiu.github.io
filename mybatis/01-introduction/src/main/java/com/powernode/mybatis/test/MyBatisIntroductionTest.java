package com.powernode.mybatis.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @date 2022/11/7&9:14
 */
public class MyBatisIntroductionTest {
    public static void main(String[] args) throws IOException {
        //获取SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

        //获取SqlSessionFactory对象
        /*sqlSessionFactoryBuilder.build(输入流文件指向mybatis-config.xml文件)*/
        //传入mybatis-config.xml文件的路径String类型
        // Resources.getResourceAsStream() 默认从类的根路径开始查找资源
        //idea默认从项目的src开始作为根目录开始查询文件
        //FileInputStream is = new FileInputStream("01-introduction/src/main/resources/com.powernode.mybatis-config.xml");
        InputStream resourceAsStream = ClassLoader.getSystemClassLoader().getResourceAsStream("mybatis-config.xml");
        /*
            Resources.getResourceAsStream()是一个工具类里面的静态方法
            底层代码实际上还是
            InputStream resourceAsStream = ClassLoader.getSystemClassLoader().getResourceAsStream("com.powernode.mybatis-config.xml");
            通过系统的类加载器去读取类路径下的资源文件 去创建一个输入流
         */
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //一般情况下都是一个数据库对应一个SqlSessionFactory对象
        SqlSessionFactory build = sqlSessionFactoryBuilder.build(is);

        //获取SqlSession对象
        //如果使用的事务管理器是JDBC的话，底层实际上还是会执行：conn.setAutoCommit(false)
        SqlSession sqlSession = build.openSession();

        //执行Sql语句(执行CarMapper.xml里面的Sql语句)
        /*sqlSession.insert(CarMapper.xml里面的insert语句的id);*/
        int count = sqlSession.insert("insertCar");//返回值是影响数据库表当中的记录条数
        System.out.println("插入了几条记录："+count);

        //sqlSession不支持自动提交，要手动提交 因为此时的事务管理器类型是JDBC
        /*
            JDBC事务管理器：
                mybatis框架自己管理事务，自己采用原生的JDBC代码去管理事务
                    conn.setAutoCommit(false)
                    ...业务处理
                    conn.commit() 手动提交事务
            MANAGED事务管理器：
                mybatis不再负责事务的管理了，事务管理交给其他容器负责，例如spring(spring的事务管理机制)
         */
        //如果使用的事务管理器是JDBC的话，底层实际上还是会执行：conn.commit()
        sqlSession.commit();

    }
}
