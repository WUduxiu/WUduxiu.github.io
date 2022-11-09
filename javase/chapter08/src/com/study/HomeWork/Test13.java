package com.study.HomeWork;

public class Test13 {
    public static void main(String[] args) {
        Person13 [] persons = new Person13[4];
        persons[0] = new Student13("张三","男",20,00001);//用String类型表示学号比较好
        persons[1] = new Student13("李四","男",21,00002);
        persons[2] = new Teacher13("王五","男",35,5);
        persons[3] = new Teacher13("马六","男",30,6);
        persons[3].printInfo();
        Person13 temp = null;
        for (int i = 0; i < persons.length-1; i++) {
            for (int n = 0;n<persons.length-1-i;n++){
                if (persons[n].getAge()<persons[n+1].getAge()){
                    temp = persons[n+1];
                    persons[n+1] = persons[n];
                    persons[n] = temp;
                }
            }
        }
        Test13 test13 = new Test13();
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
            test13.method(persons[i]);
        }
    }
    public void method(Person13 p){
        if (p instanceof Student13){
            //向下转型
            Student13 student13 = (Student13) p;
            student13.study();
        }else if(p instanceof Teacher13){
            ((Teacher13) p).teach();
        }else {
            System.out.println("do nothing");
        }
    }
}
class Person13{
    private String name;
    private String sex;
    private int age;

    public Person13(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void printInfo(){
        System.out.println("信息:"+"\n姓名: "+name+"\n年龄: "+age+"\n性别: "+sex);
    }
    public String play(){
        return getName()+"爱玩";
    }

    @Override
    public String toString() {
        return "Person13{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
class Student13 extends Person13{
    private int studentId;

    public Student13(String name, String sex, int age, int studentid) {
        super(name, sex, age);
        this.studentId = studentid;
    }

    public int getStudentid() {
        return studentId;
    }

    public void setStudentid(int studentid) {
        this.studentId = studentid;
    }
    public void study(){
        System.out.println("我"+getName()+"承认,我会 好好学习");
    }

    @Override
    public String play() {
        return super.play()+"足球";
    }

    @Override
    public void printInfo() {
        System.out.print("学生的");
        super.printInfo();
        System.out.println("学号: "+studentId);
        study();
        System.out.println(play());
    }

    @Override
    public String toString() {
        return super.toString()+"Student13{" +
                "studentId=" + studentId +
                '}';
    }
}
class Teacher13 extends Person13{
    private int workAge;

    public Teacher13(String name, String sex, int age, int workAge) {
        super(name, sex, age);
        this.workAge = workAge;
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }
    public void teach(){
        System.out.println("我"+getName()+"承诺，我会好好教书");
    }

    @Override
    public String play() {
        return super.play()+"象棋";
    }

    @Override
    public void printInfo() {
        System.out.print("老师的");
        super.printInfo();
        System.out.println("工龄: "+workAge);
        teach();
        System.out.println(play());
    }

    @Override
    public String toString() {
        return super.toString()+"Teacher13{" +
                "workAge=" + workAge +
                '}';
    }
}
