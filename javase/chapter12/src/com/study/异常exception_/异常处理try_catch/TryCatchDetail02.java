package com.study.异常exception_.异常处理try_catch;

/**
 * @date 2022/10/9&15:36
 */
public class TryCatchDetail02 {
    public static void main(String[] args) {
        try {
            Person person = new Person("jack");
            person = null;
            System.out.println(person.getName());//空指针异常：NullPointerException
            int n1 = 10;
            int n2 = 0;
            int res = n1 / n2;//数学算术异常：ArithmeticException
            System.out.println(res);
            /*
            如果try代码块中有多个异常
            可以使用多个catch，分别捕获不同的异常，相应处理
            要求子类异常写在前面，父类异常写在后面
             */
        } catch (NullPointerException e) {
            System.out.println("捕获了空指针异常" + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("捕获了数学算术异常" + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }

    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
