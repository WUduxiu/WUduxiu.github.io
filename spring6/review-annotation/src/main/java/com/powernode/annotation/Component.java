package com.powernode.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @date 2022/11/1&15:39
 *   自定义注解
 */
//标注注解的注解叫做元注解  @Target注解用来修饰@Component可以出现的位置
    //表示Component注解可以出现在类上
@Target(ElementType.TYPE)
//@Retention用来标注  @Component注解最终保留在哪 保留在Class文件中  并且可以被反射机制读取到
@Retention(RetentionPolicy.RUNTIME)
public @interface Component {
    //定义注解属性
    //String name();   //String是属性的类型  name是属性的名字
    String value();
    //int [] ages ();
}
