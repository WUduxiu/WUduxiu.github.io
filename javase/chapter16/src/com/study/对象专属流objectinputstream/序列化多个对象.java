package com.study.对象专属流objectinputstream;

import com.study.bean.Student;
import com.study.bean.User;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @date 2022/10/20&11:01
 */
public class 序列化多个对象 {
    /*
    参与序列化的ArrayList集合，User元素都需要实现 Serializable接口
     */
    public static void main(String[] args) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/student"));
        Student [] students = new Student[3];//序列化数组对象
        students[0] = new Student("jack",1);
        students[1] = new Student("tom",2);
        students[2] = new Student("lucy",3);
        oos.writeObject(students);
        oos.flush();
        oos.close();
        //序列化集合对象
        ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream("src/user"));
        List<User> users = new ArrayList<>();
        users.add(new User("张三",18));
        users.add(new User("李四",19));
        users.add(new User("王五",20));
        oos2.writeObject(users);
        oos2.flush();
        oos2.close();
    }
}
