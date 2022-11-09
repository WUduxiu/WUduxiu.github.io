package com.study.set.exercise;


import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.HashSet;
import java.util.Objects;

/**
 * @date 2022/10/15&16:29
 */
public class HashSetExercise02 {
    public static void main(String[] args) {
        Worker worker = new Worker("李四", 3000, new Birthday(2002, 1, 13));
        Worker worker1 = new Worker("李四", 3000, new Birthday(2002, 1, 1));
        Worker worker2 = new Worker("李四", 3000, new Birthday(2002, 1, 1));
        HashSet set = new HashSet();
        set.add(worker);
        set.add(worker1);
        set.add(worker2);
        System.out.println(set);
    }
}
class Worker{
    private Birthday birthday;
    private String name;
    private double sal;

    public Worker() {
    }

    public Worker(String name, double sal,Birthday birthday) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return Objects.equals(birthday, worker.birthday) && Objects.equals(name, worker.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(birthday, name);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "birthday=" + birthday +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
}
class Birthday{
    private int year;
    private int month;
    private int day;

    public Birthday(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Birthday() {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Birthday birthday = (Birthday) o;
        return year == birthday.year && month == birthday.month && day == birthday.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
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


