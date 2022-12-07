package com.powernode.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

/**
 * @date 2022/11/7&16:49
 */
public class SqlSessionUtil { //mybatis工具类
    //工具类的构造方法一般都是私有化的---->可以防止它通过构造方法来创建对象
    //工具类中所有的方法都是静态的，为了方便调用 直接类名.的方式来调用 不需要new对象调用
    //为了防止new对象，构造方法私有化，方法使用静态方法
    private SqlSessionUtil(){}
    private static SqlSessionFactory sqlSessionFactory;
    //为了防止每次调用openSession()都要创建一个SqlSessionFactoryBuilder对象
    //正常情况下一个SqlSessionFactoryBuilder对象 对应一个数据库
    //静态代码块中 初始化SqlSessionFactoryBuilder对象，因为静态代码块只会随着类的初始化加载一次
    static {
        try {
             sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static SqlSession openSession(){
        return sqlSessionFactory.openSession();
    }
}
