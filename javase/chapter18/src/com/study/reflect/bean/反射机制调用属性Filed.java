package com.study.reflect.bean;

import java.lang.reflect.Field;

/**
 * @date 2022/10/22&22:15
 */
public class 反射机制调用属性Filed {
    /*
    怎么通过反射机制访问一个java对象的属性
     例如： 给属性赋值set()
            获取属性的值get()
     */
    public static void main(String[] args) throws Exception {
        /*
            Student student = new Student();
            student1.no = 20;给属性赋值三要素 给Student对象赋值20
            1.对象 student1
            2.属性 no
            3.值 20
            System.out.println(student.no);输出的两个要素
            1.对象 student
            2.属性 no
         */
        Class studentClass = Class.forName("com.study.reflect.bean.Student");
        //通过反射机制获取Student对象  调用newInstance()方法(底层调用无参构造方法)
        Object student = studentClass.newInstance();
        //获取no属性 (根据属性名来获取Filed)
        Field age = studentClass.getDeclaredField("no");//修改的属性 遵守修饰符条件
        age.set(student,30); //遵循赋值三要素
        System.out.println(age.get(student));//遵守输出两要素
        //访问私有的属性
        Field name = studentClass.getDeclaredField("name");
        //打破封装  忽略修饰符
        //这是反射机制的缺点 可能会给不法分子留下机会 设置完之后，在外部也可以访问私有变量的
        name.setAccessible(true);
        //给name属性赋值
        name.set(student,"张三");
        //输出name属性的值
        System.out.println(name.get(student));

    }
}
