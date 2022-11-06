package com.study.文件字节流fileinputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @date 2022/10/19&15:52
 * int   available() 返回流中还没有读取的字节数量
 * long skip() 跳过几个字节不读
 */
public class FileInputStream其他常用方法 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/temp");
            int read = fis.read();//读一个字节
            //返回流中剩余的没有读到的字节数量
            int available = fis.available();
            System.out.println("剩余字节数量"+available);
            byte[] bytes = new byte[available];
            fis.read(bytes);//一次全部读完文件中的所有字节  但不适合用于太大的文件
            System.out.println(new String(bytes));
            //跳过几个字节不读
//            fis.skip(1);
//            byte[] bytes = new byte[1];
//            fis.read(bytes);
//            System.out.println(new String(bytes));
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
