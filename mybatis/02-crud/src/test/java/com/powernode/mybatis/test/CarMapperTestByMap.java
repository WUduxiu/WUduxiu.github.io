package com.powernode.mybatis.test;

import com.powernode.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @date 2022/11/7&19:35
 */
public class CarMapperTestByMap {
    @Test
    //测试使用mybatis中的#{}占位符来传输值  并且用Map集合来存储数据
    public void testInsertCar() {
        SqlSession sqlSession = SqlSessionUtil.openSession();
       /*
         模拟从前端form表单拿到数据
         用Map集合封装
        */

        Map<String, Object> map = new HashMap<>();
       /*map.put("k1","1111");
       map.put("k2","比亚迪汉");
       map.put("k3",10.0);
       map.put("k4","2022-11-11");
       map.put("k5","电车");*/
        map.put("carNum", "1112");
        map.put("brand", "比亚迪秦");
        map.put("guidePrice", "15.0");
        map.put("produceTime", "2022-1-1");
        map.put("carType", "新能源");

        //执行sql语句
        /*sqlSession.insert(sql语句的id,对象)
         *第一个参数：sqlId   从CarMapper.xml文件中赋值
         * 第二个参数：封装数据的对象
         * */
        int count = sqlSession.insert("insertCar", map);
        System.out.println("新增的数据条数：" + count);
        sqlSession.commit();
        sqlSession.close();
    }
}
