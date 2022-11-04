package com.study.homework;

import com.sun.xml.internal.ws.api.pipe.NextAction;

import java.util.*;

/**
 * @date 2022/10/16&17:39
 */
public class Test03 {
    public static void main(String[] args) {
        Worker worker1 = new Worker("jack", 650);
        Worker worker2 = new Worker("tom", 1200);
        Worker worker3 = new Worker("smith", 2900);
        Map map = new HashMap();
        map.put(worker1.getName(),worker1.getSal());
        map.put(worker2.getName(),worker2.getSal());
        map.put(worker3.getName(),worker3.getSal());
        System.out.println(map);
        map.put(worker1.getName(),2600.0);
        System.out.println(map);
        //给所有员工加工资加100
        Set set1 = map.keySet();
        for (Object o :set1) {
            map.put(o,(double)map.get(o)+100);
        }
        System.out.println(map);
        //遍历所有员工
        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            Map.Entry entry = (Map.Entry) next;
            System.out.println(entry.getKey()+"-" +entry.getValue());

        }


    }
}
class Worker{
    private String name;
    private double sal;

    public Worker(String name, double sal) {
        this.name = name;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
}
