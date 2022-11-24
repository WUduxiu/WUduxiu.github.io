package com.powernode.spring6.bean;

import com.powernode.spring6.bean.util.DBUtil;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

/**
 * @date 2022/11/6&16:10
 */
@Component("baseDao")
public class BaseDao {
    // 编写通用的增删改方法(sql不确定，需要传入，同时，sql中的值也不确定)
    // insert into students values (?,?,?,?)
    // 需要在方法中传一个不确定类型不确定数量的值
    // BaseDao.Update("insert into students values (?,?,?,?)",1,1,1,1)
    public static boolean Update(String sql, Object... args) {
        boolean UpdateSucc = false; // 判断更新是否执行
        Connection connection = null; // 连接对象
        PreparedStatement preparedStatement = null; // 数据库操作对象
        try {
            connection = DBUtil.getConnection(); // 注册驱动&获取连接
            preparedStatement = connection.prepareStatement(sql); // 预编译传入的SQL
            for (int i = 1; i <= args.length; i++) { // 通过循环，往预编译的SQL传值
                preparedStatement.setObject(i, args[i - 1]);
            }
            int row = preparedStatement.executeUpdate(); // 该SQL改变了多少行数据
            if (row != 0) { // 判断该条SQL是否改变数据，如改变，则将UpdateSucc设为true
                UpdateSucc = true;
            }
        } catch (Exception e) {
            e.printStackTrace(); // 打印异常
        } finally {
            DBUtil.closeConnection(connection, preparedStatement, null); // 释放资源
        }
        return UpdateSucc;
    }

    // 编写通用的查询方法 （1、查询返回值单个 2、查询返回值为集合）

    // 1、查询返回值单个
    public static <T> T SelectOne(Class<T> clazz, String sql, Object... args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            // 查询T的代码
            connection = DBUtil.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            for (int i = 1; i <= args.length; i++) { // 通过循环，往预编译的SQL传值
                preparedStatement.setObject(i, args[i - 1]);
            }
            resultSet = preparedStatement.executeQuery();
            // 处理查询结果集的步骤（需要将不确定的查询表以及不确定的实体类对应上）
            // 需要将查询出来的结果中的列名称与实体类中的属性名称对应，然后传值
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            // 查询出来的结果的信息都包含在MetaData中，所以需要创建这个对象
            int columnCount = resultSetMetaData.getColumnCount(); // 获取查询出来的列数
            if (resultSet.next()) { // 判断是否有查询数据
                T t = clazz.newInstance(); // 将对象实例化 == 等价于 new Student、new Teacher
                for (int i = 1; i <= columnCount; i++) { // 给对象中指定的属性赋值
                    // 获取列名、列值
                    String columnName = resultSetMetaData.getColumnName(i); // 列名
                    Object columnValue = resultSet.getObject(i);
                    // 通过反射去将两者进行匹配，并传值
                    Field field = clazz.getDeclaredField(columnName);
                    field.setAccessible(true);
                    field.set(t, columnValue);
                }
                return t;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeConnection(connection, preparedStatement, resultSet);
        }
        return null;
    }

    // 2、查询返回值为集合
    public static <T> List<T> SelectList(Class<T> clazz, String sql, Object... args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            // 查询T的代码
            connection = DBUtil.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            for (int i = 1; i <= args.length; i++) { // 通过循环，往预编译的SQL传值
                preparedStatement.setObject(i, args[i - 1]);
            }
            resultSet = preparedStatement.executeQuery();
            // 处理查询结果集的步骤（需要将不确定的查询表以及不确定的实体类对应上）
            // 需要将查询出来的结果中的列名称与实体类中的属性名称对应，然后传值
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            // 查询出来的结果的信息都包含在MetaData中，所以需要创建这个对象
            int columnCount = resultSetMetaData.getColumnCount(); // 获取查询出来的列数
            if (columnCount != 0) { // 判断是否有查询数据
                List<T> list = new ArrayList<T>();
                while (resultSet.next()) {
                    T t = clazz.newInstance(); // 将对象实例化 == 等价于 new Student、new Teacher
                    for (int i = 1; i <= columnCount; i++) { // 给对象中指定的属性赋值
                        // 获取列名、列值
                        String columnName = resultSetMetaData.getColumnName(i); // 列名
                        Object columnValue = resultSet.getObject(i);
                        // 通过反射去将两者进行匹配，并传值
                        Field field = clazz.getDeclaredField(columnName);
                        field.setAccessible(true);
                        field.set(t, columnValue);
                    }
                    list.add(t);
                }
                return list;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeConnection(connection, preparedStatement, resultSet);
        }
        return null;
    }

    //3.分页
    public static int getTotleCount(String sql) {
        //计算总数的sql String sql = "select count(1) from goods"
        int count = -1;
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet res = null;
        try {
            conn = DBUtil.getConnection();
            pst = conn.prepareStatement(sql);
            res = pst.executeQuery();
            if (res.next()) {
                count = res.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeConnection(conn, pst, res);
        }
        return count;
    }

}
