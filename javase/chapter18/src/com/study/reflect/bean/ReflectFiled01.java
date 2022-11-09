package com.study.reflect.bean;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @date 2022/10/22&21:22
 */
public class ReflectFiled01 {
    public static void main(String[] args) throws Exception {
        //反射字段
        Class s = Class.forName("com.study.reflect.bean.Student");
        System.out.println(s.getName());//完整的类名
        System.out.println(s.getSimpleName());//简类名
        //返回Student类中 所有用public修饰的属性
        Field[] fields = s.getFields();
        System.out.println(fields.length);
        System.out.println(fields[0].getName());
        //获取所有的属性
        System.out.println("---------------------------------");
        Field[] fields1 = s.getDeclaredFields();
        for (Field field : fields1) {
            //返回的修饰符是一个数字，每个数字是修饰符的代号
            //可以将"这个代号"数字，转换成字符串
            int i = field.getModifiers();
            System.out.println(i);
            String modifierString = Modifier.toString(i);//返回修饰符(字符串)
            Class<?> type = field.getType();//返回属性的类型(String int )
            field.getModifiers();
            System.out.println(modifierString+" "+type.getSimpleName()+ " " +field.getName());//获取属性的名字
        }


    }
}
