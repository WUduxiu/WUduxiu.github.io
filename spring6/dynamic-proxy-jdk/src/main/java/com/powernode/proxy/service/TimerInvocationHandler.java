package com.powernode.proxy.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @date 2022/11/3&22:53
 */
public class TimerInvocationHandler implements InvocationHandler {
    private Object target;

    public TimerInvocationHandler(Object target) {
        this.target = target;
    }

    //专门负责计时的一个调用处理器对象
    //在这个调用处理器当中编写及时相关的增强代码
    //这个调用处理器只需要写一个就好了
     /*
        1.为什么一定要去实现InvocationHandler这个接口
            因为一个类实现一个接口，就必须实现接口里面的方法
            以下方法必须是invoke()因为JDK在底层调用invoke()方法已经提前写好了
            这个invoke()方法不是我们程序员手动去调的 是JDK负责去调用的
        2.什么时候调用invoke()方法呢？
            当代理对象调用代理方法时，注册在InvocationHandler调用处理器当中的invoke()方法会被调用
        3.invoke方法的三个参数
            invoke方法是JDK负责调用的，所以JDK调用这个方法的时候会自动传这三个参数
            我们可以直接使用
            第一个参数：Object proxy 代理对象的引用   使用较少
            第二参数：Method method 目标对象的目标方法(实际上要执行的方法)
            第三个参数：Object[] args 目标方法上的实参
         */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {//接口提供了写增强代码的地方
        //调用目标对象上的目标方法
        //方法四要素：哪个对象的，哪个方法，要传什么参数，返回什么值
        long begin = System.currentTimeMillis();
        Object retValue = method.invoke(target, args);
        long end = System.currentTimeMillis();
        System.out.println("耗时"+(end-begin)+"毫秒");
        //返回目标对象的目标方法的返回值
        return retValue;
    }
}
