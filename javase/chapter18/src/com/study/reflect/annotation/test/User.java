package com.study.reflect.annotation.test;

import sun.font.TrueTypeGlyphMapper;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * @date 2022/10/23&17:58
 */
@Id
public class User {
    private int id;
    private String name;
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("com.study.reflect.annotation.test.User");
        boolean id = c.isAnnotationPresent(Id.class);
       // System.out.println(id);
        if (id){
            //当一个类上有@Id 再进行后续处理
            Field[] declaredFields = c.getDeclaredFields();//返回所有属性
            boolean loop = false;
            for (Field field : declaredFields) {
                if ("id".equals(field.getName())&&"int".equals(field.getType().getSimpleName())){
                    loop = true;
                    break;
                }
            }
            if (!loop){
                throw new MyException("被@Id注解标注的类中，必须要有一个int类型的id属性");
            }

        }
    }
}
