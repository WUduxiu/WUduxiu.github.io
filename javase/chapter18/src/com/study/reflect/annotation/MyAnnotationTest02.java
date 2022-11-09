package com.study.reflect.annotation;

/**
 * @date 2022/10/23&17:08
 */
public class MyAnnotationTest02 {
    @MyAnnotation02(value = "hh",color = "red")
    //注解属性只有一个，且属性名叫value才能省略
    // 注解的属性名是value  该属性名可以省略  可以不写 value=
    public void doSome() {
    }
    @MyAnnotation02(value = "hh",color = "blue")
    public void doOther(){

    }

}
