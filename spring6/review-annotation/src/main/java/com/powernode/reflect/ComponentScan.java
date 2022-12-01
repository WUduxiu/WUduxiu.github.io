package com.powernode.reflect;

import com.powernode.annotation.Component;

import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @date 2022/11/1&16:08
 */
public class ComponentScan {
    public static void main(String[] args) throws Exception {
        Map<String,Object> beanMap = new HashMap<>();
        //目前只知道一个包的名字，扫描这个包中所有的类，当这个类上有@Component注解的时候
        //把这个类实例化出来 统一放到Map集合中去
        String packageName = "com.powernode.bean";
        //把包名变成路径名
        /*
        使用正则表达式 将字符串中的所有“.” 变成“/”
        “.”这个正则表达式代表任意字符，这里的“.”必须是一个普通字符
        在正则表达式里面如何表达一个普通字符“.” \.表示
        在java里面\\代表一个\前面的表示转义字符  所以普通字符“.” 在java里面用“\\.”表示
         */
        String packagePath = packageName.replaceAll("\\.","/");
        //System.out.println(packagePath);
        //com是在类路径下的一个根目录
        URL url = ClassLoader.getSystemClassLoader().getResource(packagePath);
        String path = url.getPath();
        //System.out.println(path);
        File file = new File(path);
        File[] files = file.listFiles();
        Arrays.stream(files).forEach(f->{
            try {
                //System.out.println(f.getName());
                //split通过 “.”区别 分成一个数组  “.”前面的是下标为0   “.”后面的是下标为1
                // System.out.println(f.getName().split("\\.")[0]);
                String className = packageName+"."+f.getName().split("\\.")[0];
                //通过反射机制解析注解
                Class<?> aClass = Class.forName(className);
                if (aClass.isAnnotationPresent(Component.class)) {
                    //获取注解
                    Component annotation = aClass.getAnnotation(Component.class);
                    String id = annotation.value();
                    //有这个注解的都要创建对象
                    Object obj = aClass.newInstance();
                    beanMap.put(id,obj);

                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        });
        System.out.println(beanMap);

    }
}
