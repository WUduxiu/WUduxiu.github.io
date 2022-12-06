package com.powernode.mybatis.test;

import com.powernode.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @date 2022/11/7&19:06
 */
public class CarMapperUtilTest {
    @Test
    //测试使用工具类 完成新增数据
    public void testInsertCarByUtil(){
        SqlSession sqlSession = null;
        try {
             sqlSession = SqlSessionUtil.openSession();
            int count = sqlSession.insert("insertCar");
            System.out.println("新增的条数：" +count );
            sqlSession.commit();
        } catch (Exception e) {
            //if语句是为防止 因为上面sqlSession = SqlSessionUtil.openSession();出现异常直接进入catch语句中
            //实际上SqlSession sqlSession = null sqlSession还是null
            //防止sqlSession.rollback(); 发生空指针异常
            if (sqlSession!=null){
                sqlSession.rollback();
            }
            e.printStackTrace();
        }finally {
            if (sqlSession!=null){
                sqlSession.close();
            }
        }

    }
}
