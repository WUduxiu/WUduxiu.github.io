package com.study.homework;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @date 2022/10/16&16:33
 */
public class Test01 {
    public static void main(String[] args) {
        News news1 = new News("新冠确诊病例超千万，数百万印度教徒赴恒河”圣浴“ 引民众担忧");
        News news2 = new News("男子突然想起2个月前钓的鱼还在网兜里，捞起一看赶紧放生");
        ArrayList list = new ArrayList();
        list.add(news1);
        list.add(news2);
        for (int i = 0; i < list.size(); i++) {
            Object o = list.get(i);
            News news = (News) o;
            if (news.getTitle().length()>=15){
                String s = news.getTitle().substring(0, 15);
                 s = s+"...";
               list.set(i,s);
            }
        }
        Collections.reverse(list);
        System.out.println(list);


    }
}
class News{
    private String title;
    private String Info;

    public News(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInfo() {
        return Info;
    }

    public void setInfo(String info) {
        Info = info;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                '}';
    }
}
