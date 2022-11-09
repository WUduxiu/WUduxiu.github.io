package com.study.HomeWork;

public class Test10 {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("jack", 30, "医生", "男", 3000);
        Doctor doctor2 = new Doctor("jack", 31, "医生", "男", 3000);
        Doctor doctor3 = doctor1;
        System.out.println(doctor1.equals(doctor2));
        System.out.println(doctor1.teacherEquals(doctor2));
        System.out.println(doctor1.teacherEquals(doctor3));
        System.out.println(doctor1.equals(doctor3));

    }
}
class Doctor{
    private String name;
    private int age;
    private String job;
    private String sex;
    private double sal;

    public Doctor(String name, int age, String job, String sex, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.sex = sex;
        this.sal = sal;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
    public boolean equals(Object obj){
//        if (this == obj){
//            return true;
//        }
        if (obj instanceof Doctor){
            if (((Doctor) obj).name.equals(this.name)&&((Doctor) obj).job.equals(this.job)
                    &&((Doctor) obj).sex.equals(this.sex)&&
                    ((Doctor) obj).age==this.age&&((Doctor) obj).sal==this.sal){
                        return true;
            }
        }
        return false;

    }
    public boolean teacherEquals(Object obj){
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Doctor)){
            return false;
        }
        //向下转型
        Doctor doctor = (Doctor) obj;
        return doctor.age==this.age&&doctor.job.equals(this.job)&&doctor.name.equals(this.name)&&
                doctor.sex.equals(this.sex)&&doctor.sal==this.sal;

    }
}
