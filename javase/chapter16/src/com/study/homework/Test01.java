package com.study.homework;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @date 2022/10/19&22:42
 */
public class Test01 {
   public static void main(String[] args) {
      File file = new File("C:\\Users\\Hasee\\Desktop\\idea代码\\abc");
      try {
         copy(file);
      } catch (Exception e) {
         e.printStackTrace();
      }

   }
   public static void copy(File file) throws Exception {
      if (file.exists()){
         File[] files;
         if (file.isDirectory()){
             files = file.listFiles();

            for (File filelist :files) {
               System.out.println(filelist.getAbsolutePath());
               //File[] filelist1 = filelist.listFiles();
//               if (filelist1!=null){
//                  for (File file1 :filelist1) {
//                     copy(file1);
//                  }
//               }else {
//                  break;
//               }
               FileInputStream fis = new FileInputStream(filelist);
               FileOutputStream fos = new FileOutputStream("D:\\JavaTest");
               byte[] bytes = new byte[1024];
               int read = 0;
               while ((read=fis.read(bytes))!=-1){
                  fos.write(bytes,0,read);
               }
               fis.close();
               fos.close();
            }
         }



      }else {
         throw new RuntimeException("文件不存在");
      }


   }

}


