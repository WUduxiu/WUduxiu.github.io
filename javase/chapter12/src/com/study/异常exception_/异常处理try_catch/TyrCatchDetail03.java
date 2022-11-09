package com.study.异常exception_.异常处理try_catch;

/**
 * @date 2022/10/9&15:55
 */
public class TyrCatchDetail03 {
    public static void main(String[] args) {
        try {
            int n1 = 10;
            int n2 = 0;
            System.out.println(n1/n2);
        } finally {
            System.out.println("执行了finally代码块");
        }
        //因为没有对异常进行处理，所以直接退出程序 相当于默认进行了throws抛出异常
        System.out.println("程序继续运行");
    }

}
