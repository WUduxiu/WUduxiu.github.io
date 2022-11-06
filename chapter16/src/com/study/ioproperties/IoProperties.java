package com.study.ioproperties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

/**
 * @date 2022/10/20&16:45
 * IO+properties联合使用
 *  经常改变的数据可以单独写进一个文件中
 *  将来只需要改变文件的内容，java代码不需要改变
 *  不需要重新编译文件，服务器也不需要重新启动，就可以拿到动态的信息
 *  类似以上机制的文件 称为配置文件 并且当配置文件的内容格式为
 *    key=value时 这种配置文件叫做属性配置文件
 *   java规范中有要求，属性配置文件要求以.properties文件  以.properties结尾的文件在java中被称为配置文件
 *   其中Properties是专门存放属性文件的一个类
 */
public class IoProperties {
    public static void main(String[] args) throws Exception {
        /*
        Properties是一个Map集合，key和value都是String类型
        想将userinfo文件中的数据加载到Properties中
         */
        //新建一个流
        FileReader reader = new FileReader("src/userinfo.properties");
        //新建Map集合
        Properties properties = new Properties();
        //调用properties对象的load()方法将文件中的数据加载到map集合中去
        properties.load(reader);//文件中的数据顺着管道加载到map集合中，其中等号左边为key 右边为value
        //通过key来获取value
        String username = properties.getProperty("username");
        System.out.println(username);
        String password = properties.getProperty("password");
        System.out.println(password);

    }
}
