package com.powernode.spring6.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * @date 2022/10/30&17:38
 *  Bean的生命周期按照粗略的五步可分为
 *  1.实例化Bean(调用无参数构造方法)
 *  2.给Bean的属性赋值(调用set方法)
 *  3.初始化Bean(会调用Bean的init方法  这个init方法需要自己写)
 *  4.使用Bean
 *  5.销毁Bean(会调用Bean的destroy方法  这个destroy方法需要自己写)
 */
public class User implements BeanNameAware, BeanFactoryAware, BeanClassLoaderAware, InitializingBean,DisposableBean {
    private String name;

    public User() {
        System.out.println("第一步：User的无参数构造方法被调用");
    }

    public void setName(String name) {
        System.out.println("第二步：给对象的属性赋值");
        this.name = name;
    }


    //这个方法需要自己写 方法名随意
    public void initBean(){
        System.out.println("第四步：初始化Bean");
    }
    //这个方法需要自己写 方法名随意
    public void destroyBean(){
        System.out.println("第七步：销毁：Bean");
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("Bean这个类的加载器是"+classLoader);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("生产这个Bean的工厂对象是"+beanFactory);
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("这个Bean的名字是"+s);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean接口中的afterPropertiesSet方法执行");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Disposable接口中的destroy方法执行");
    }
}
