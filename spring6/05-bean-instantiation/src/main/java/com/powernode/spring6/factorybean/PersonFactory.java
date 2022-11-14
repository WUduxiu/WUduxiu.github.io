package com.powernode.spring6.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @date 2022/10/30&16:24
 *   实现这个接口以后 默认对象是单例的
 *    return FactoryBean.super.isSingleton();
 */
public class PersonFactory implements FactoryBean<Person> {
    //PersonFactory实际上也是一个Bean 只不过比较特殊，通过工厂Bean可以获取普通Bean
    @Override
    public Person getObject() throws Exception {
        //最终对象的实例化还是自己new的
        return new Person();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
    //可以自己改
    //如果想返回多例对象的话，可以修改返回值  true--->false
    @Override
    public boolean isSingleton() {
        return true;
    }
}
