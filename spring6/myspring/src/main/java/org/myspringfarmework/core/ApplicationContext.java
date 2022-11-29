package org.myspringfarmework.core;

/**
 * @date 2022/10/31&20:25
 *   mySpring应用上下文的一个接口
 */
public interface ApplicationContext {
    //根据bean的名称获取对应的bean对象
    //就是xml中配置的bean的id
    Object getBean(String beanName);
}
