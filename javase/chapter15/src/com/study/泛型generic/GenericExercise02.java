package com.study.泛型generic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;

/**
 * @date 2022/10/16&20:56
 */
public class GenericExercise02 {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("tom",300,new Birthday(2005,1,1)));
        employees.add(new Employee("tom",3500,new Birthday(2008,1,2)));
        employees.add(new Employee("tom",5000,new Birthday(2002,1,3)));
        System.out.println("排序前-"+employees);
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                //先对传入的参数进行验证
                if (!(o1 instanceof Employee && o2 instanceof Employee)) {
                    System.out.println("类型不正确");
                    return 0; //表示不比较
                }
                //比较name
                int i = o1.getName().compareTo(o2.getName());
                if (i != 0) {
                    return i;
                }
                return o1.getBirthday().compare(o1.getBirthday(), o2.getBirthday());
            }

            });
        System.out.println("排序后 -"+employees);
    }
}
class Employee{
    private Birthday birthday;
    private String name;
    private double sal;

    public Employee() {
    }

    public Employee(String name, double sal, Birthday birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "birthday=" + birthday +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }

    public Birthday getBirthday() {
        return birthday;
    }

    public void setBirthday(Birthday birthday) {
        this.birthday = birthday;
    }
}
class Birthday implements Comparator<Birthday>{
    private int year;
    private int month;
    private int day;

    public Birthday(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public int compare(Birthday o1, Birthday o2) {
        //如果name的比较相同 就比较birthday - year
        int yearMinus = o1.getYear() - o2.getYear();
        if (yearMinus != 0) {
            return yearMinus;
        }
        //如果年份也相同就比较月份
        int monthMinus = o1.getMonth() - o2.getMonth();
        if (monthMinus != 0) {
            return monthMinus;
        }
        //如果月份也相同就比较日期
        return o1.getDay() - o2.getDay();
    }

    @Override
    public String toString() {
        return "Birthday{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}

