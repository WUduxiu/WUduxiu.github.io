package com.study.map.exercise;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @date 2022/10/16&13:18
 */
public class MapExercise01 {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        Worker worker1 = new Worker(1, "jack", 3000);
        Worker worker2 = new Worker(2, "tom", 4000);
        Worker worker3 = new Worker(3, "lucy", 5000);
        hashMap.put(worker1.getId(),worker1);
        hashMap.put(worker2.getId(),worker2);
        hashMap.put(worker3.getId(),worker3);
        //1. 通过entrySet()
        Set set = hashMap.entrySet();
        for (Object o : set) {
            //向下转型  Map.Entry 是 entry的内部类
            Map.Entry entry = (Map.Entry) o;  //entry 运行类型是HashMap$Node 实现了 Map.Entry
            //这边因为返回的是对象  需要向下转型为 Worker才能拿到属性
            Worker worker = (Worker) entry.getValue();
            if (worker.getSal()>3000){
                System.out.println(worker);
            }
        }
        //2. 直接获取values
        Collection values = hashMap.values();
        for (Object o : values) {
           Worker worker = (Worker) o;
           if (worker.getSal()>3000){
               System.out.println(worker);
           }
        }
        //3.先获取key 通过 get(Key) 获取到value
        Set set1 = hashMap.keySet();
        for (Object o : set1) {
            Object o1 = hashMap.get(o);
            //向下转型
            Worker worker = (Worker) o1;
            if (worker.getSal()>3000){
                System.out.println(worker);
            }
        }


    }
}
class Worker{
    private int id;
    private String name;
    private double sal;

    public Worker(int id, String name, double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
}
