package com.study.常用类.homework.teacher;

/**
 * @date 2022/10/12&23:21
 */
public class TeacherTest02 {
    public static void main(String[] args) {
        String username = null;
        String pwd = "123456";
        String email = "@.";
        try {
            userRegister(username, pwd, email);
            System.out.println("注册成功");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    public static void userRegister(String username, String pwd, String email) {
        if (!(username != null && pwd != null && email != null)) {
            throw new RuntimeException("传入的参数不能为null");
        }
        //1.判断名字的长度
        int nameLength = username.length();
        if (!(nameLength >= 2 && nameLength <= 4)) {
            throw new RuntimeException("用户长度必须为2-4");
        }
        //2.判断密码是否为6位数 以及是否是纯数字
        if (!(pwd.length() == 6 && isDigital(pwd))) {
            throw new RuntimeException("密码长度必须为6位数，且是纯数字");
        }
        //3.判断邮箱中是否含有@ 和 . 且 @必须在.的前面
        int i = email.indexOf("@");
        int j = email.indexOf(".");
        if (!(i > -1 && j > i)) {
            throw new RuntimeException("邮箱中必须有@和. 且@必须在.的前面");
        }
        System.out.println("用户名为" + username);
        System.out.println("密码为" + pwd);
        System.out.println("邮箱为" + email);

    }

    public static boolean isDigital(String pwd) {
        char[] chars = pwd.toCharArray();
        for (int i = 0; i < pwd.length(); i++) {
            if (chars[i] < '0' || chars[i] > '9') {//考虑反情况比较合适
                /*
                如果是在for循环里面返回true的话，不能保证六个字符全是数字，12a456 这种情况第一次就返回 true了 后面判断不到
                 */
                return false;
            }
        }
        return true;
    }

}
