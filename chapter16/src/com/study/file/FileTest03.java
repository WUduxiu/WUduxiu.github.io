package com.study.file;

import java.io.File;

/**
 * @date 2022/10/19&22:36
 *  File的 listFile()方法
 */
public class FileTest03 {
    public static void main(String[] args) {
        File file = new File("D:/");
        //获取当前目录下的所有子文件
        File[] files = file.listFiles();
        for (File file1 :files) {
            System.out.println(file1.getAbsolutePath());
        }

    }
}
