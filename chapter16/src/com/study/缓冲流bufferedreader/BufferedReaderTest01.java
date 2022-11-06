package com.study.缓冲流bufferedreader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @date 2022/10/19&17:48
 * BufferReader:
 *  带有缓冲区的字符输入流
 *  使用这些流的时候 不需要自定义数组 byte[]  char[]
 */
public class BufferedReaderTest01 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("src/temp");//节点流
        //当一个流的构造方法中需要一个流的时候，这个被传进来的流叫做：节点流
        //外部负责包装的这个流，叫做：包装流，还有一个名字叫做：处理流
        BufferedReader bufferedReader = new BufferedReader(reader);//处理流/包装流
        String s = null;
        //readLine() 该方法当读到一行的末尾时会返回null
        //读取速度还是原先的快，因为该读取方式是被包装过的  但是使用方便
        while ((s=bufferedReader.readLine())!=null){
            System.out.println(s);//没有读到文件的换行符(读取一个文本行，但是不带换行符)
        }
        //关闭流 对于包装流来说，只需要关闭最外层流就行，里面的节点流会自动关闭
        bufferedReader.close();
    }
}
