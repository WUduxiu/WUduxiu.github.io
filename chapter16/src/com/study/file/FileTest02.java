package com.study.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @date 2022/10/19&22:28
 * File类的常用方法
 *
 */
public class FileTest02 {
    public static void main(String[] args) {
        File file = new File("src/log.txt");
        String name = file.getName();
        System.out.println("获取文件名:"+name);
        System.out.println(file.isFile());//判断是否是一个文件  t
        System.out.println(file.isDirectory());//判断是否是一个目录 f
        //获取文件最后一次的修改时间
        long l = file.lastModified();//返回的是1970-1-1 到现在的毫秒数
        Date date = new Date(l);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String format = sdf.format(date);
        System.out.println(format);
        //获取文件大小 (字节)
        System.out.println(file.length());
    }
}
