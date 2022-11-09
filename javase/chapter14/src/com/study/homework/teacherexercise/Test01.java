package com.study.homework.teacherexercise;


import java.util.ArrayList;

/**
 * @date 2022/10/16&17:17
 */
public class Test01 {
    public static void main(String[] args) {
        News news1 = new News("新冠确诊病例超千万，数百万印度教徒赴恒河”圣浴“ 引民众担忧");
        News news2 = new News("男子突然想起2个月前钓的鱼还在网兜里，捞起一看赶紧放生");
        ArrayList list = new ArrayList();
        list.add(news1);
        list.add(news2);
        int size = list.size();
        for (int i = size-1;i>=0;i--){//倒序
            News news = (News) list.get(i);
            System.out.println(processTitle(news.getTitle()));
        }
    }
    public static String processTitle(String title){
        if (title==null){
            throw new RuntimeException("标题不能为空");
        }
        if (title.length()>15){
            return title.substring(0,15) + "...";
        }else {
            return title;
        }
    }
}
    class News {
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

