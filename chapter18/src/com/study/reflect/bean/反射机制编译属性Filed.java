package com.study.reflect.bean;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @date 2022/10/22&21:52
 */
public class 反射机制编译属性Filed {
    public static void main(String[] args) throws Exception {
        StringBuffer stringBuffer = new StringBuffer();
        Class studentClass = Class.forName("com.study.reflect.bean.Student");
        //Field[] fields = studentClass.getFields();//返回的public修饰的属性
        Field[] fields = studentClass.getDeclaredFields();//返回类中所有的属性
        stringBuffer.append(Modifier.toString(studentClass.getModifiers())+" class "+studentClass.getSimpleName()+"{\n");
        for (Field field : fields) {
            stringBuffer.append("\t");
            stringBuffer.append(Modifier.toString(field.getModifiers())+" ");//属性修饰符
            stringBuffer.append(field.getType().getSimpleName()+" ");//属性类型名(简易名)
            stringBuffer.append(field.getName()+";\n");//属性名
        }
        stringBuffer.append("}");
        System.out.println(stringBuffer);
    }
}
