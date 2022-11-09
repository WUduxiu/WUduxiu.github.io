package com.study.map;

import java.util.Properties;

/**
 * @date 2022/10/16&14:46
 */
public class Properties01 {
    /*
    1.Properties类继承了HashTable类并实现了Map接口，也是使用一种键值对的形式来保存数据
    2.他的使用特点和HashTable类似
    3.Properties 还可以用于 从xxx.Properties 文件中，加载数据到Properties 类对象，并进行读取和修改
    4.xxx.Properties 文件通常作为配置文件
     */
    public static void main(String[] args) {
        /*
        .Properties类继承了HashTable类
        所以键值对不能为null
         */
        Properties properties = new Properties();
        properties.put("john",100);
        properties.put("lucy",200);
        properties.put("lucy",100);
        properties.put("lucy",200);//替换
        System.out.println(properties);
        //properties.put(null,1); NullPointerException
        //properties.put(1,null);  NullPointerException
        //删除
        properties.remove("lucy");
        //修改
        properties.put("john","300");
        //通过 key查找
        System.out.println(properties.get("john"));
        System.out.println(properties.getProperty("john"));//返回的是String
        System.out.println(properties);
    }
}
