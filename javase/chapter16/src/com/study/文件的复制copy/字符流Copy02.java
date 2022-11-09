package com.study.文件的复制copy;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @date 2022/10/19&17:31
 * 使用FileReader 和 FileWriter 只能拷贝普通本文文件
 * 普通本文文件：能用记事本编辑的都是普通文本文件 java文件也是  java文件运行的是class文件
 */
public class 字符流Copy02 {
    public static void main(String[] args) {
        FileReader fis = null;
        FileWriter fos = null;
        try {
            fis = new FileReader("src/copy");
            fos = new FileWriter("src/newcopy");
            char[] chars = new char[1024];
            int n = 0;
            while ((n=fis.read(chars))!=-1){  //n=fis.read(chars)返回每次读取的字符个数
                fos.write(chars,0,n);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
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
