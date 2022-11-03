package com.study.常用类.stringbuilder类;

/**
 * @date 2022/10/11&22:04
 */
public class StringBuilder01 {
    public static void main(String[] args) {
        /*
            1.此类提供一个与StringBuffer兼容的API，但不保证同步(StringBuilder 不是线程安全的)
            2.也基础了AbstractStringBuilder 直接父类
            3.也实现了Serializable接口，代表其可以串行化(该对象可以网络传输，也可以保存在文件)
            4.public final class StringBuilder 是一个final类 不可被继承
            5.StringBuilder 对象的字符序列仍然是存放在其父类AbstractStringBuilder 的属性 char value[];中
               因此字符内容、序列是存在在堆中
            6.StringBuilder的方法，没有做互斥的处理，既没有 Synchronized关键字，因此在单线程的情况下使用

         */

        StringBuilder stringBuilder = new StringBuilder();
    }
}
