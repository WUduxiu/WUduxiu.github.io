package com.study.file;


import java.io.File;
import java.io.IOException;

/**
 * @date 2022/10/19&22:06
 * File:
 *  File类和四大家族 FileInputStream FileOutputStream FileReader FileWriter没有关系
 *  使用file 不能完成完成文件的读和写
 *  File对象代表什么？
 *  D:\JavaTest 这是一个File对象              对应的是目录
 *  D:\JavaTest\temp 这也是一个File对象        对应的是文件
 *  一个File对象有可能对应的是目录，也有可能对应的是文件 File只是一个路径名的抽象表现形式
 */
public class FileTest01 {
    public static void main(String[] args) throws Exception {
        //创建一个file对象
        File file = new File("D:\\JavaTest1\\test");
        //判断是否存在
        //System.out.println(file.exists());
        //如果不存在就以文件的实现创建出来
//        if (!file.exists()){
//            file.createNewFile();
//        }
        //如果不存在就以目录(文件夹)的形式创建出来
//        if (!file.exists()){
//            file.mkdir();
//        }
        //如果不存在就以多重目录的形式创建出来
        if (!file.exists()){
            file.mkdirs();
        }
        String path = file.getParent();
        System.out.println(path);//获取文件父类的路径
        File parentFile = file.getParentFile();//获取父类文件
        System.out.println(parentFile.getAbsolutePath());//父类文件的getAbsolutePath() 输出绝对路径

    }
}
