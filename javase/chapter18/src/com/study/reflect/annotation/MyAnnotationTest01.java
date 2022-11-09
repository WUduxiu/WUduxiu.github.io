package com.study.reflect.annotation;

/**
 * @date 2022/10/23&17:01
 */
public class MyAnnotationTest01 {
//    @MyAnnotation01()
//    public void doSome(){
//    }   注解有了属性，就要给属性赋值 除非该属性使用了default指定了默认值
    @MyAnnotation01(name="张三",color = "red" )
    public void doSome(){

    }
}
