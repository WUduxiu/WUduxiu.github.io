package com.study.标准输出流printstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * @date 2022/10/19&21:18
 * PrintStream:
 *  标准的字节输出流 默认输出到控制台
 *
 */
public class PrintStreamTest01 {
    public static void main(String[] args) throws Exception {
        //连在一起写
        System.out.println("hello world");
        //分开写
        PrintStream ps = System.out;
        /*
        System常用的方法
        System.gc()垃圾回收器
        System.currentTimeMillis()计算1970-1-1到现在的秒  long
        System.exit(0) 退出程序
        System.arraycopy()  复制数组
         */
        ps.println("hello world");
        //标准输出流不需要手动关闭
        //改变标准输出流的输出方向
        PrintStream log = new PrintStream(new FileOutputStream("src/log",true));
        System.setOut(log);
        System.out.println("改变了标准输出流的输出方向");
        System.out.println("不再输出到控制台");

    }
}
