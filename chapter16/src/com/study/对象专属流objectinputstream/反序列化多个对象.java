package com.study.对象专属流objectinputstream;

import com.study.bean.Student;
import com.study.bean.User;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.List;

/**
 * @date 2022/10/20&11:14
 */
public class 反序列化多个对象 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/student"));
        Object o = ois.readObject();//o就是一个数组对象  反序列化数组对象
        Student[] students = (Student[]) o;
        for (Object o1 :students) {
            System.out.println(o1);
        }
        ois.close();
        //反序列化集合对象
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("src/user"));
        Object user = ois2.readObject();
        List<User> users = (List<User>) user;
        for (User user1 :users) {
            System.out.println(user1);
        }

    }
}
