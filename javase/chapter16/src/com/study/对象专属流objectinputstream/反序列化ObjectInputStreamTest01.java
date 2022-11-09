package com.study.对象专属流objectinputstream;

import java.io.*;

/**
 * @date 2022/10/20&10:57
 */
public class 反序列化ObjectInputStreamTest01 {
    public static void main(String[] args) throws Exception {
        //反序列化对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/student"));
        //开始序列化 读
        Object o = ois.readObject();//该对象就是学生对象
        System.out.println(o);
        //关闭流
        ois.close();


    }
}
