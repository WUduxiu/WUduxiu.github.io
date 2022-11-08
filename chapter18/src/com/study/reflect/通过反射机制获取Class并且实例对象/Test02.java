package com.study.reflect.通过反射机制获取Class并且实例对象;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.util.Properties;

/**
 * @date 2022/10/22&16:16
 *  验证反射机制的灵活性
 */
public class Test02 {
    public static void main(String[] args) throws Exception {
        //通过IO流读取配置文件
//        String path = Thread.currentThread().getContextClassLoader().
//                getResource("classinfo.properties").getPath();
//        System.out.println(path);
        //直接以流的形式返回
        InputStream reader = Thread.currentThread().getContextClassLoader().
                getResourceAsStream("classinfo.properties");
//        FileReader reader = new FileReader(path);
        //创建属性对象Map
        Properties properties = new Properties();
        //加载信息
        properties.load(reader);
        //关闭流
        reader.close();
        //通过key 获取value
        String s = properties.getProperty("classname");
        //通过反射机制 获取Class对象
        Class<?> c = Class.forName(s);
        //使用Class对象的newInstance() 实例化对象
        Object User = c.newInstance();
        System.out.println(User);


    }
}
