package com.study.异常exception_.异常处理try_catch.exercise;

/**
 * @date 2022/10/9&16:01
 */
public class TryCatchExercise01 {
    public static int method() {
        try {
            String[] names = names = new String[3];
            if (names[1].equals("tom")) {//NullPointerException空指针异常
                System.out.println(names[1]);
            } else {
                names[3] = "hello";
            }
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            return 2;
        } catch (NullPointerException e) {
            return 3;
        } finally {//必须执行 所以返回值为4
            return 4;
        }
    }

    public static void main(String[] args) {
        System.out.println(method());
    }
}
