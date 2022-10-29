package _07方法练习;

public class Test12 {
    public static void main(String[] args) {
        Employee employee = new Employee("管理",4000);

    }
}
class Employee{
    String name;
    char sex;
    int age;
    String job;
    double sal;
    public Employee(String name,char sex,int age,String job,double sal){//复用构造器  形参有相同的
        //this.(参数) 构造器访问构造器 但是必须在第一行
        this(name,sex,age);
        this.job = job;
        this.sal = sal;

    }
    public Employee(String name,char sex,int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public Employee(String job,double sal){
        this.job = job;
        this.sal = sal;
    }

}
