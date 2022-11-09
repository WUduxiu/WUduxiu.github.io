package com.study.文件字节流fileinputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @date 2022/10/19&16:10
 * 文件字节输出流，负责写(从内存到硬盘)
 */
public class FileOutStreamTest01 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            //如果文件不存在 会自动创建
            //这种构造器 写的话 不会覆盖原先的文件内容 而是在末尾添加
            fos = new FileOutputStream("src/myfile",true);//可以在构造器中追加 true
            byte [] bytes = {97,98,99,100};
            //开始写  这种方式会将原文件清空，然后重新写入
            fos.write(bytes);//将bytes数组全部写入  写入abcd
            //第二次写的时候  就清空了第一次写的文件内容
            fos.write(bytes,0,2);//将bytes数组部分写入 ab
            String s = "嘎嘎嘎嘎嘎嘎嘎";
            byte[] bytes1 = s.getBytes(StandardCharsets.UTF_8);
            fos.write(bytes1);
            //写完要刷新
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
