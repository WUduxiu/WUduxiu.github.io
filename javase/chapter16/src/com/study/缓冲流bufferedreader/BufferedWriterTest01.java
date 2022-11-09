package com.study.缓冲流bufferedreader;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 * @date 2022/10/19&20:49
 * 带有缓冲的字符输出流
 *
 */
public class BufferedWriterTest01 {
    public static void main(String[] args)throws Exception {
        BufferedWriter br = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("src/write",true)));
        br.write("使用包装流的缓冲字符输出流");
        br.write("\n123");
        //刷新
        br.flush();
        //关闭最外层
        br.close();
    }
}
