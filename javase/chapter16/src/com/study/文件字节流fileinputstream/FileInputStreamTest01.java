package com.study.文件字节流fileinputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @date 2022/10/18&21:36
 * 1.文件字节输入流，万能的，任何类型的文件都可以采用这个流来读
 * 2.字节的方式，完成输入的操作，完成读的操作(从硬盘到内存)
 */
public class FileInputStreamTest01 {
    public static void main(String[] args) {
        //创建文件字节输入流对象
        //文件路径(绝对路径)：D:\JavaTest\temp  java里面单斜杠\表示转义的意思 idea帮我们自动补齐
        //也可以写成 D:/JavaTest/temp
        FileInputStream fis  = null;
        try {
            fis = new FileInputStream("D:\\JavaTest\\temp");
            int read = fis.read();//返回的是字节所对应的阿斯克编码  "字节本身"
            System.out.println(read);
            read = fis.read();
            System.out.println(read);
            read = fis.read();
            System.out.println(read);
            read = fis.read();
            System.out.println(read);
            read = fis.read();
            //当内容读取完毕以后，就会返回-1
            System.out.println(read);
            read = fis.read();
            System.out.println(read);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis!=null){//防止空指针异常
                try {
                    fis.close();//确保流的关闭
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
