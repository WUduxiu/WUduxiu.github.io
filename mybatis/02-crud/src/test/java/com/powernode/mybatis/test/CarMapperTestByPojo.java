package com.powernode.mybatis.test;

import com.powernode.mybatis.pojo.Car;
import com.powernode.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @date 2022/11/7&20:12
 */
public class CarMapperTestByPojo {
    @Test
    //用pojo实体类来存放数据
    public void testCarMapperByPojo(){
        //封装数据
        Car car = new Car(null,"3333","比亚迪秦",30.0,"2022-11-10","新能源");
        //新增数据
        SqlSession sqlSession = SqlSessionUtil.openSession();
        //执行sql语句
        int count = sqlSession.insert("insertCar",car);
        System.out.println("新增的数据条数：" +count);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    //根据id删除
    public void testDelete(){
        SqlSession sqlSession = SqlSessionUtil.openSession();
        //执行sql语句
        int count = sqlSession.delete("deleteById",15);
        System.out.println(count==1 ? "删除成功" : "删除失败");
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    //根据id进行修改
    public void testUpdateById(){
        SqlSession sqlSession = SqlSessionUtil.openSession();
        //准备数据
        Car car = new Car(1L, "1000", "BWM", 50.0, "2022-11-8", "燃油车");
        //执行sql语句
        int count = sqlSession.update("updateById", car);
        System.out.println(count==1 ? "修改成功" : "修改失败");
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    //根据id查找一条记录
    public void testSelectById(){
        SqlSession sqlSession = SqlSessionUtil.openSession();
        //执行sql
        Car car = sqlSession.selectOne("car.selectById", 1);
        System.out.println(car);
        //查询语句不需要提交
        /*sqlSession.commit();*/
        sqlSession.close();
    }

    @Test
    //查询所有记录
    public void testSelectAll(){
        SqlSession sqlSession = SqlSessionUtil.openSession();
        //执行sql
        List<Car> cars = sqlSession.selectList("car.selectAll");
        //遍历cars集合
        cars.forEach(car-> System.out.println(car));
        sqlSession.commit();
        sqlSession.close();
    }
}
