package com.study.泛型generic.homework;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @date 2022/10/17&16:31
 */
public class Test01 {
    public static void main(String[] args) {
    }
    @Test
    public void test(){
        Dap<User> dao = new Dap<>();
        dao.save("001",new User(20,1,"jack"));
        dao.save("002",new User(20,2,"tom"));
        List<User> list = dao.list();
        System.out.println(list);
        dao.update("001",new User(19,1,"jack"));
         list = dao.list();
        System.out.println("修改后");
        System.out.println(list);
        dao.delete("001");
        list = dao.list();
        System.out.println("删除后");
        System.out.println(list);
        System.out.println("002"+dao.get("002"));


    }
}
class Dap<T>{
   private Map<String,T> map = new HashMap<>();
    public void save(String id,T entity){
        map.put(id,entity);
    }
    public T get(String id){
        return map.get(id);
    }
    public void update(String id,T entity){
        //key为id的内容指的就是其 value
        map.put(id,entity);
    }
    //先创建一个ArrayList数组
    //遍历map[k-v],将map的所有value(T entity),封装到ArrayList数组中
    public List<T> list(){
        List<T> list = new ArrayList<>();
        //遍历数组
        Set<String> keySet = map.keySet();
        for (String s : keySet) {
            list.add(map.get(s));
            //或者是使用上面的方法 list.add(get(s));
        }

        return list;
    }
    public void delete(String id){
        map.remove(id);
    }
}
class User{
    private int age;
    private int id;
    private String name;

    public User(int age, int id, String name) {
        this.age = age;
        this.id = id;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    @Override
    public String toString() {
        return "\nUser{" +
                "age=" + age +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
