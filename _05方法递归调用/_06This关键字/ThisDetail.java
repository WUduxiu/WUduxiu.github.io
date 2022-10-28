package _05方法递归调用._06This关键字;

public class ThisDetail {//this不能在类定义的外部使用 只能在类定义的方法使用
    public static void main(String[] args) {
        T t = new T();
        t.f2();
        t.f3();


    }
}
class T{
    String name = "属性";
    public void f1(){
        System.out.println("f1()方法");
    }
    public void f2(){
        f1();
        this.f1();
        System.out.println("f2()方法");
    }
    public void f3(){
        //this访问属性
        String name = "局部变量";
        System.out.println("name="+name);//这里输出的name是就近原则
        System.out.println("name="+this.name);//这里是this访问属性

    }
//This使用细节：构造器相互访问
    public  T(){//使用无参构造器去访问下面有参数的构造器
        /*
        访问构造器语法：this(形参列表)
        只能构造器访问构造器
        并且该语法放在第一条
         */
        this(20,"jack");
        System.out.println("无参构造器");
    }
    public T(int age,String name){
        System.out.println("成功访问构造器");
    }
}
