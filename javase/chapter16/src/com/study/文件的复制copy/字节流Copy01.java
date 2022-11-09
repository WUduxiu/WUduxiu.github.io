package com.study.文件的复制copy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @date 2022/10/19&16:35
 * 使用FileInputStream + FileOutStream 完成文件的拷贝
 * 拷贝的过程是一边读 一边写
 * 使用以上字节流拷贝文件的时候，文件类型随意，是万能的，什么样的文件都可以拷贝
 */
public class 字节流Copy01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //创建一个输入流对象
            fis = new FileInputStream("C:\\Users\\Hasee\\Desktop\\Music\\林宥嘉 - 心有林夕.mp3");
            byte[] bytes = new byte[10 * 1024]; //1次读1MB
            fos = new FileOutputStream("src/music",true);
            int read = 0;
            while ((read=fis.read(bytes))!=-1){  //fis.read()返回的是读到的字节的个数 用数组来存储阿斯克编码
                fos.write(bytes,0,read);
            }
            //写完之后一定要刷新
            fos.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭两个流的话 分开进行异常处理 防止因为一个流的异常而影响另一个流的关闭
            if (fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
