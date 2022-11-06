package com.study.文件字节流fileinputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @date 2022/10/18&22:08
 */
public class FileInputStreamTest02 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("D:\\JavaTest\\temp");
            while (true){
                int read = fis.read();
                if (read==-1){//当后面没有内容时 返回-1 退出循环
                    break;
                }
                System.out.println(read);
            }
            int readData = 0;
            while ((readData=fis.read())!=-1){ //把返回的值赋给 readData
                System.out.println(readData);
            }
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
