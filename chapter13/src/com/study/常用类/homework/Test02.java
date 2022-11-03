package com.study.常用类.homework;

import java.util.Scanner;

/**
 * @date 2022/10/12&22:20
 */
public class Test02 {
    public static void main(String[] args) {
        String username = "root";
        String password = "12345c";
        String email = "@.";
        try {
            steEmail(username,password,email);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            return;
        }catch (NumberFormatException e){
            e.printStackTrace();
            return;
        }catch (MyException e){
            e.printStackTrace();
            return;
        }
        catch (RuntimeException e){
            e.printStackTrace();
            return;
        }
    }

    public static void steEmail(String username, String password, String email) {
        if (!(username.length() >= 2 && username.length() <= 4)) {
            throw new ArrayIndexOutOfBoundsException("用户名长度必须2-4");
        }
        if (password.length()==6){
            try {
                int i = Integer.valueOf(password);
            } catch (NumberFormatException e) {
                throw new MyException("密码必须为全数字");
            }
        }else{
            throw new NumberFormatException("密码长度必须为6位数");
        }

        if (!(email.indexOf("@") != -1 && email.indexOf(".") != -1 && email.indexOf("@") < email.indexOf("."))) {
            throw new RuntimeException("邮箱输入有误");
        }
        System.out.println("用户名为"+username);
        System.out.println("密码为"+password);
        System.out.println("邮箱为"+email);
    }
}
class MyException extends RuntimeException{
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}
