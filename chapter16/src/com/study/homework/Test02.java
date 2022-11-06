package com.study.homework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @date 2022/10/24&15:58
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        //先判断目录
        File file = new File("text");
        if(!file.exists()){
            //如果不存在，就创建
            if (file.mkdir()){
                System.out.println("创建" + file.getPath() +" 创建成功");
            }else {
                System.out.println("创建" + file.getPath() +" 创建失败");
            }
        }
        //判断目录里面的文件是否存在
        File file1 = new File("text/text.txt");
        if (!file1.exists()){
            //如果目录里文件不存在 就创建
            if (file1.createNewFile()){
                System.out.println("创建" + file1.getPath()+"创建成功");
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file1));
                bufferedWriter.write("hello world");
                bufferedWriter.flush();
                bufferedWriter.close();
            }else {
                System.out.println("创建" + file1.getPath()+"创建失败");
            }
        }else {
            System.out.println("文件已经存在，无需重复创建");
        }



    }
}
