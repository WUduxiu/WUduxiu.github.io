package com.powernode.spring6.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @date 2022/10/31&14:13
 */
public class LogBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("第三步：执行Bean后处理器的before方法");
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }
    //方法有俩个参数
    //1.刚创建的bean对象
    //2.刚创建的bean对象的名字
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("第五步：执行Bean后处理器的after方法");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
