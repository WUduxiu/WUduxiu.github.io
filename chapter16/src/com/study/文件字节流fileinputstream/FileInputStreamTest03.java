package com.study.文件字节流fileinputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @date 2022/10/18&22:26
 * 一次最多读取b.length个字节
 * 减少硬盘和内存的交互，提高程序的执行效率
 * 往byte[]数组中读取
 */
public class FileInputStreamTest03 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            /*
                "D:\\JavaTest\\temp"这种是绝对路径
                IDEA默认文件的相对路径是 工程Project的根就是默认的路径
             */
            fis = new FileInputStream("src/temp");//相对路径  默认的路径开头就是工程名
            //采用byte数组，一次读取多个字节，最多读取数组.length个字节
            byte []  bytes = new byte[4];//准备数组长度为4的数组，一次最多读取4个字节
            int read = fis.read(bytes);//返回的是读取的字节数量
            System.out.println(read);//4
            System.out.println(new String(bytes,0,read));//从0开始到读取到的个数
            read = fis.read(bytes);//再次读取只剩一个字节  当数组满了 后面要读取的字节 会覆盖前面的元素
            System.out.println(read);//1
            System.out.println(new String(bytes,0,read));
            read = fis.read(bytes);//第三次读取没有读取到字节 返回-1
            System.out.println(read);//-1
            //System.out.println(new String(bytes,0,read));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
