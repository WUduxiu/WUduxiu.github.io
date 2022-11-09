package com.study.bean;

import java.io.Serializable;

/**
 * @date 2022/10/20&10:39
 */
public class Student implements Serializable {
  //当java虚拟机看到Serializable 这个接口时，会自动生成一个序列化版本号
  //这里没有显示出来，java虚拟机会默认提供
  private String name;
  private int id;
  private static final long serialVersionUID = 1L;//自定义版本序列号

  public Student() {
  }

  public Student(String name, int id) {
    this.name = name;
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "Student{" +
            "name='" + name + '\'' +
            ", id=" + id +
            '}';
  }
}
