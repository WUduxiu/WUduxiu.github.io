package com.study.HomeWork;

public class Test03 {
    public static void main(String[] args) {
        Professor professor = new Professor("jack",30,"教授",3000);
        professor.introduce();
        Aprofessor aprofessor = new Aprofessor("Tom",30,"副教授",3000);
        aprofessor.introduce();
        Lecturer lecturer = new Lecturer("Lisa",30,"讲师",3000);
        lecturer.introduce();

    }
}
class Teacher{
    private String name;
    private int age;
    private String Post;

    public Teacher(String name, int age, String post) {
        this.name = name;
        this.age = age;
        Post = post;
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

    public String getPost() {
        return Post;
    }

    public void setPost(String post) {
        Post = post;
    }

    public void introduce(){
        System.out.print("name="+name+" age="+age+" post="+Post);
    }
}
class Professor extends Teacher{
    private double salary;
    public Professor(String name, int age, String post, double salary) {
        super(name, age, post);
        this.salary = 1.3*salary;
    }
    public void introduce(){
        super.introduce();
        System.out.println(" salary="+salary);
}
}
class Aprofessor extends Teacher{
    private double salary;
    public Aprofessor(String name, int age, String post, double salary) {
        super(name, age, post);
        this.salary = 1.2*salary;
    }
    public void introduce(){
        super.introduce();
        System.out.println(" salary="+salary);
    }
}
class Lecturer extends Teacher{
    private double salary;
    public Lecturer(String name, int age, String post, double salary) {
        super(name, age, post);
        this.salary = 1.1*salary;
    }
    public void introduce(){
        super.introduce();
        System.out.println(" salary="+salary);
    }
}
