package com.study.文件字符流filereader;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @date 2022/10/19&17:19
 * 文件字符输出流  写
 * 只能输出普通文本
 *
 */
public class FileWriterTest01 {
    public static void main(String[] args) {
        FileWriter writer = null;
        try {
            writer = new FileWriter("src/write",true);
            char [] chars = {'哈','1','哈','哈','哈','哈'};
            writer.write(chars);//可以写一个char数组
            writer.write("GBK真的操蛋");//也可以直接写String字符串
            writer.write("\n");//换行
            writer.write(chars,1,chars.length-1);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (writer!=null){
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
