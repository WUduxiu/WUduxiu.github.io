package com.powernode.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @date 2022/10/31&17:41
 */
public class ReflectTest3 {
    /*
       需求
        已知以下信息
        1.有这样的一个类，类名叫做：com.powernode.reflect.User
        2.这个类符合javabean规范：属性私有化，对外提供公开的setter和getter方法
        3.你还知道这个类中有一个属性，属性名字是age
        4.并且还知道 age属性的类型是int类型
       使用反射机制调用相关方法，给User对象的age属性赋值
     */
    public static void main(String[] args) throws Exception {
        String className = "com.powernode.reflect.User";
        String propertyName = "age";
        Class clazz = Class.forName(className);
        String setMethod = "set" + propertyName.toUpperCase().charAt(0)+propertyName.substring(1);
        //int.class  表示steAge方法需要传入的参数是int类型的
        //根据属性名字获取属性类型
        Field field = clazz.getDeclaredField(propertyName);
        Method setAge = clazz.getDeclaredMethod(setMethod, field.getType());
        Object o = clazz.newInstance();
        setAge.invoke(o, 20);
        //表示getAge是无参方法  不需要传递参数
        Method getAge = clazz.getDeclaredMethod("getAge");//getAge(){return age}
        Object invoke = getAge.invoke(o);
        System.out.println(o);

    }
}
