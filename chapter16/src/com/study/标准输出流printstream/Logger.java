package com.study.标准输出流printstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @date 2022/10/19&21:31
 *      日志工具
 */
public class Logger {
    public static void log(String msg)  {
        //指向一个日志文件
        PrintStream out = null;
        try {
            out = new PrintStream(new FileOutputStream("src/log.txt",true));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //改变标准输出流的输出位置
        System.setOut(out);
        Date date = new Date();//获取当前事件
        //设置时间格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String format = sdf.format(date);
        System.out.println(format+": "+msg);


    }
}
