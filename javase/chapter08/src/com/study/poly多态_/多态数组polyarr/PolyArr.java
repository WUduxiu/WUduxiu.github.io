package com.study.poly多态_.多态数组polyarr;

public class PolyArr {
    public static void main(String[] args) {
        /*
        1.创建一个Person对象
        2.创建俩个Student对象 和 俩个Teacher对象，统一放在数组中，并调用每个对象的say()方法
         */
        //int [] arr = new int[5];创建对象数组类似创建 一维数组
        Person[] persons = new Person[5];
        persons[0] = new Person("jack",20);
        persons[1] = new Student("jack",20,80);
        persons[2] = new Student("Tom",21,90);
        persons[3] = new Teacher("scott",30,10000);
        persons[4] = new Teacher("king",50,20000);
        for (int i = 0; i <persons.length ; i++) {
            //此时persons[i]的编译类型是 Person  运行类型在变化
            //System.out.println(persons[i].say());  ;//此时存在动态绑定机制
            // instanceof  用于判断 俩个对象是否是相同的运行类型
            // 或者是前面的类型是后面类型的子类
            if (persons[i] instanceof Student){
                Student student = (Student) persons[i];
                student.study();
                //也可以写成一条语句
                //((Student)persons[i).study
            }else if (persons[i] instanceof Teacher){
                Teacher teacher = (Teacher) persons[i];
                teacher.teach();
            }else if (persons[i] instanceof Person){
                Person person = (Person) persons[i];
                System.out.println(person.say());

            }else {
                System.out.println("你的类型有误");
            }
        }
    }
}

