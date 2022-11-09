package com.study.常用类.system类;

import java.util.Arrays;

/**
 * @date 2022/10/12&19:07
 */
public class SystemMethod {
    public static void main(String[] args) {
        /*
            exit 退出当前程序
            exit(0)表示正常退出
            0表示一个状态，正常的状态
         */
        System.out.println("ok1");
        //System.exit(0);
        System.out.println("OK2");

        int [] oldArr = {0,1,2};
        int [] newArr = new int[3];
        /*
        从源数组下标为0开始，复制到新数组中，也是从新数组的下标为0开始，复制多少个元素到新数组中
         */
        System.arraycopy(oldArr,0,newArr,0,oldArr.length-1);
        //如果长度不过的话  就是显示默认值0
        System.out.println(Arrays.toString(newArr));

        System.out.println(System.currentTimeMillis());//返回当前时间距离 1970-1-1的毫秒数

        //调用垃圾回收机制
        System.gc();
    }
}
