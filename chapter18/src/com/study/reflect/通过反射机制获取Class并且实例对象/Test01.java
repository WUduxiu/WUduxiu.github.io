package com.study.reflect.通过反射机制获取Class并且实例对象;

/**
 * @date 2022/10/22&16:04
 * 通过反射机制，获取Class，通过Class来实例化对象
 */
public class Test01 {
    public static void main(String[] args) {
        try {
            //通过反射机制，获取Class，通过Class来实例化对象
            Class<?> c = Class.forName("com.study.reflect.通过反射机制获取Class并且实例对象.User");
            Object obj = c.newInstance();
            //c.newInstance() 这个方法会调用User的无参构造方法 完成User对象的创建
            //所以必须保证无参构造要存在，如果定义了有参构造，没有显示的定义无参构造 就无法完成对User对象的创建
            //java.lang.InstantiationException 抛出异常
            System.out.println(obj);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
