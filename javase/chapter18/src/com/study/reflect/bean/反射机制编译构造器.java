package com.study.reflect.bean;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/**
 * @date 2022/10/23&15:44
 */
public class 反射机制编译构造器 {
    public static void main(String[] args)throws Exception {
        StringBuilder s = new StringBuilder();
        Class VipClass = Class.forName("com.study.reflect.bean.Vip");
        s.append(Modifier.toString(VipClass.getModifiers())+" class "+VipClass.getSimpleName()+" {\n");
        s.append("}");
        //拼接构造方法
        /*
        public Vip(int no) {
        this.no = no;
        }
         */
        Constructor[] c = VipClass.getDeclaredConstructors();
        for (Constructor constructor :c) {
            s.append(Modifier.toString(constructor.getModifiers())+" ");
            s.append(constructor.getName());
            s.append("(");
            //拼接参数
            Class[] parameterTypes = constructor.getParameterTypes();
            for (Class aClass :parameterTypes) {
                s.append(aClass.getSimpleName()+",");
            }
            if (parameterTypes.length>0){
                s.deleteCharAt(s.length()-1);
            }

            s.append("){}\n");
        }
        System.out.println(s);

    }
}
