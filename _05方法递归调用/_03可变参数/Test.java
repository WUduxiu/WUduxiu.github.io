package _05方法递归调用._03可变参数;

public class Test {
    public static void main(String[] args) {
        GetType getType = new GetType();
        int i =1;
        double b = 2.0;
        String name = "1";

        System.out.println(GetType.getType(i+b+name ));
    }
}
 class GetType {
    public static String getType(Object test) {
        return test.getClass().getName().toString();

    }
    public static void main(String[] args) {
        int i = 1;
        System.out.println(getType(i));

    }

}
