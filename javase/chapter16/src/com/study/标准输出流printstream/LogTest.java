package com.study.标准输出流printstream;

/**
 * @date 2022/10/19&21:40
 */
public class LogTest {
    //测试日志工具类
    public static void main(String[] args)  {
        Logger.log("调用了System类的gc()方法，建议启动垃圾回收");
        Logger.log("用户尝试登录，登陆失败");
        Logger.log("日志工具十分好用");

    }
}
