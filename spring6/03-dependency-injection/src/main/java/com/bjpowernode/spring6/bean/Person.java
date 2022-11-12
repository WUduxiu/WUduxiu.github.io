package com.bjpowernode.spring6.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @date 2022/10/28&22:47
 */
public class Person {
    private List<String> list;
    private Set<String> set;
    private Map<Integer,String> map;

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    /*
              注入属性类对象
              Properties本质上也是一个Map集合
              Properties的父类Hashtable实现了Map接口
              虽然这个也是一个Map集合，虽然和Map的注入方式有点像，但是不同
              Properties的key和value只能是 String类型
         */
    private Properties properties;

    @Override
    public String toString() {
        return "Person{" +
                "list=" + list +
                ", set=" + set +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }

    public void setMap(Map<Integer, String> map) {
        this.map = map;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

}
