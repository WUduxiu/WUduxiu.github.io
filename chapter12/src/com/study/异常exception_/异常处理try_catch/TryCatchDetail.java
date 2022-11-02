package com.study.异常exception_.异常处理try_catch;

/**
 * @date 2022/10/7&22:20
 */
public class TryCatchDetail {
    public static void main(String[] args) throws Exception {
        //如果没有try-catch处理或者显示的使用throws  有一个默认的throws
        try {
            String str = "123";
            int a = Integer.valueOf(str);//出现异常
            System.out.println("转换结果" + a);//出现异常后不会执行该语句，而是直接进入 catch块
        } catch (NumberFormatException e) {//try模块里面语句正常，则不会进入到catch模块中
            // e.printStackTrace();
            System.out.println(e.getMessage());
        } finally {//不论try代码块中的代码是否正确，都执行
            System.out.println("finally代码块被执行");
        }
        System.out.println("程序继续");


    }
}
