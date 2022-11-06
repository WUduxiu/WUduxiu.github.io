package com.study.对象专属流objectinputstream;

import com.study.bean.Student;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * @date 2022/10/20&10:30
 * NotSerializableException: com.study.bean.Student
 * Student类不支持序列化
 */
public class 对象序列化ObjectOutputStreamTest01 {
    public static void main(String[] args) throws Exception {
        //创建对象
        //参与序列化的对象 必须实现Serializable这个接口
        /*
        public interface Serializable {
        该接口是一个标志接口，接口中没有任何方法 只是起到标志作用，给java虚拟机看的
        当java虚拟机看到这个标志时，会给该类自动生成一个序列化版本号
        }
         */
        Student student = new Student("张三", 1);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/student"));
        //开始序列化对象
        oos.writeObject(student);
        //刷新流
        oos.flush();
        //关闭流
        oos.close();
    }
}
