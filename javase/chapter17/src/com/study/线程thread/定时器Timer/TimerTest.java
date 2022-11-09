package com.study.线程thread.定时器Timer;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @date 2022/10/21&22:57
 * 使用定时器指定定时任务
 */
public class TimerTest {
    public static void main(String[] args) throws Exception {
        //创建定时器对象
        Timer timer = new Timer();//无参构造
        //Timer timer1 = new Timer(true); 守护线程的方式
       // timer.schedule(定时任务，第一次执行时间，间隔多久执行一次);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date firstTime = simpleDateFormat.parse("2022-10-21 23:15:00");
        //每10s执行一次
        timer.schedule(new LogTimer(),firstTime,1000*10);
        //也可以使用匿名内部类的方式
    }
}
//编写一个类去实现抽象类里面的方法
class LogTimer extends TimerTask {

    @Override
    public void run() {
        //编写任务
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String time = sdf.format(new Date());
            System.out.println(time+" 完成了一次备份");

    }
}
