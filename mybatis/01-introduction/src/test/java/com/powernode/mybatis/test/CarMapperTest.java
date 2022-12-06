package com.powernode.mybatis.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

/**
 * @date 2022/11/7&16:07
 */
public class CarMapperTest {
    @Test
    //测试使用mybatis的insert方法
   public void testInsertCar(){
       //
       SqlSession sqlSession =null;
       try {
          //获取SqlSessionFactoryBuilder对象
          SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
          //通过sqlSessionFactoryBuilder.build()获取 SqlSessionFactory对象
          SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(Resources.getResourceAsStream("mybatis-config.xml"));
          //通过sqlSessionFactory.openSession()获取 SqlSession对象
          //开启会话(底层会开启事务)
          sqlSession = sqlSessionFactory.openSession();
          //执行SQL语句
          //调用sqlSession的方法(在CarMapper.xml写好的 具体的方法)
          int count = sqlSession.insert("insertCar");
          System.out.println("提交的数据条数： "+count);
          //执行到这里没有异常，提交事务，终止事务
          sqlSession.commit();
       } catch (Exception e) {
          //遇到异常最好回滚事务
          if (sqlSession!=null) {
             //防止由于上面出现异常  倒置sqlSession=null  出现空指针异常
             sqlSession.rollback();
          }
          e.printStackTrace();
       }finally {
          //关闭会话(释放资源)
          if (sqlSession!=null){
             sqlSession.close();
          }
       }
    }
}
