package com.study.reflect.资源绑定器Bundle;

import java.util.ResourceBundle;

/**
 * @date 2022/10/22&20:30
 */
public class BundleTest01 {
    public static void main(String[] args) {
        /*
        java.util包提供了一个资源绑定器，便于获取属性配置文件的内容
        用这种方式，属性文件必须xxx.properties文件必须放在类路径下(src文件夹中)
         */
        //资源绑定器，只能绑定xxx.properties，文件必须在类路径下
        //并且在写路径的时候，路径的拓展名不能写
        ResourceBundle bundle =  ResourceBundle.getBundle("classinfo");
        String classname = bundle.getString("classname");
        System.out.println(classname);
        try {
            Class<?> c = Class.forName(classname);
            Object o = c.newInstance();
            System.out.println(o);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


    }
}
