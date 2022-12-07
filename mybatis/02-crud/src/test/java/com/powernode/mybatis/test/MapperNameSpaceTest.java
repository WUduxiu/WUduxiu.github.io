package com.powernode.mybatis.test;

import com.powernode.mybatis.pojo.Car;
import com.powernode.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @date 2022/11/8&22:25
 */
public class MapperNameSpaceTest {
    @Test
    //测试命名空间 mapper namespace对xml配置文件的影响
    public void testNameSpace(){
        SqlSession sqlSession = SqlSessionUtil.openSession();
        //执行sql
        /*
         List<Car> cars = sqlSession.selectList("selectAll");
        由于有两个相同的id selectAll 单纯写一个select id无法正确匹配
         */
        //此时 <mapper namespace="car"> . <select id="selectById"
        //即 namespace.id
        List<Car> cars = sqlSession.selectList("car.selectAll");
        cars.forEach(car->{
            System.out.println(car);
        });
        sqlSession.close();
    }
}
