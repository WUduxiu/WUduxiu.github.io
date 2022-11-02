package com.study.异常exception_.异常处理try_catch.exercise;

/**
 * @date 2022/10/9&16:14
 */
public class TryCatchExercise02 {
    public static int method(){
        int i =1;
        try {
            i++;
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
            return ++i;
        } finally {//必须执行 所以返回值为4
            return ++i;
        }
    }

    public static void main(String[] args) {
        System.out.println(method());
    }
    }

