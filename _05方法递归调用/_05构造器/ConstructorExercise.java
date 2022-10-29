package _05方法递归调用._05构造器;

public class ConstructorExercise {
    public static void main(String[] args) {
        PersonExercise p1 = new PersonExercise();
        System.out.println("p1输出信息如下:name="+p1.name+"\t"+"age="+p1.age);
        //输出结果为  name = null  age=18
        PersonExercise p2 = new PersonExercise(20,"小明");
        System.out.println("p2的信息如下：name="+p2.name+"\t"+"age="+p2.age);

    }
}
class PersonExercise{
    int age;
    String name;
    public PersonExercise(){//无参构造
        // 初始化age的属性值为18

        age = 18;
    }
    public PersonExercise(int pAge,String pName){
        age = pAge;//此时是用的class PersonExercise的全局变量
        name = pName;
        int age1 = pAge;//这里面的age1 是局部变量 除了在这个方法里面使用 其他地方都不能使用
    }
}
