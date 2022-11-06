package com.study.文件字节流fileinputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @date 2022/10/18&23:10
 */
public class FileInputStream最终版 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/temp");
            //准备一个byte数组
            byte [] bytes = new byte[4];
//            while (true){
//                int read = fis.read(bytes);
//                if (read==-1){
//                    break;
//                }
//                System.out.print(new String(bytes,0,read));
//            }
            int n = 0;
            while ((n=fis.read(bytes))!=-1){//先将值赋给 n
                System.out.print(new String(bytes,0,n));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
