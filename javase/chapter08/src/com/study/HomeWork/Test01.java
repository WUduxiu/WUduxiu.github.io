package com.study.HomeWork;

public class Test01 {
    public static void main(String[] args) {
        Person [] persons = new Person[3];
        persons[0] = new Person("jack",30,"教师");
        persons[1] = new Person("Tom",21,"学生");
        persons[2] = new Person("Mike",25,"学生");
        Person temp = null;
        for (int i = 0; i < persons.length-1; i++) {//i<长度  这里面长度指的是 5个数字要比较4次
            for (int n=0;n<persons.length-1-i;n++){//n<长度   这里面长度指的是还未排序的数字 要比较的次数
                    if (persons[n].getAge()<persons[n+1].getAge()){
                        temp = persons[n+1];
                            persons[n+1] = persons[n];
                            persons[n] = temp;
                    }
            }
        }
        for (int i = 0; i < persons.length; i++) {
                System.out.println(persons[i]+" ");
        }

    }
}
class Person{
    private String name;
    private int age;
    private String job;

    public Person() {
    }

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
