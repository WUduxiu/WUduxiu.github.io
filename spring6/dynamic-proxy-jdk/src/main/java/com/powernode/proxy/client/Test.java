package com.powernode.proxy.client;

import com.powernode.proxy.service.OrderService;
import com.powernode.proxy.service.OrderServiceImpl;
import com.powernode.proxy.service.TimerInvocationHandler;
import com.powernode.proxy.util.ProxyUtil;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @date 2022/11/3&22:26
 */
public class Test {
    //客户端程序
    public static void main(String[] args) {
        //1.创建目标对象
        OrderService target = new OrderServiceImpl();
        //2.创建代理对象
        //Object proxyObj = Proxy.newProxyInstance(类加载器，代理类要实现的接口，调用处理器);  具体参数
        /*
        1.newProxyInstance翻译为：新建代理对象
            也就是说，通过调用这个方法可以创建代理对象
            本质上，这个newProxyInstance()方法的执行，做了两件事
               第一件事：在内存中动态的生成了一个代理类的字节码class文件
               第二件事：new了一个对象 通过内存中生成的代理类的这个字节码文件，实例化了代理对象
         2.关于newProxyInstance()的三个参数  的各个参数的具体含义 有什么作用
            第一个参数：ClassLoader loader->类加载器的作用
                在内存当中生成的字节码文件也是class文件，要执行也需要先加载到内存当中，加载类就需要加载器，所以这里需要指定类加载器
                并且JDK要求，目标类的类加载器必须和代理类的类加载器使用同一个
            第二个参数： Class<?>[] interfaces
                代理类和目标类要实现同一个接口或者同一些接口
                在内存中生成代理类的时候，这个代理类是需要你指明要实现那些接口的。
            第三个参数：InvocationHandler h 翻译为调用处理器，是一个接口
                在调用处理器接口中编写的就是： 要增强的功能代码
                因为具体要增强什么功能，增加的代码 JDK动态代理技术不知道
                既然是接口就要写接口的实现类
         */
        //因为代理对象和目标对象实现了同一个接口，所以可以向下转型
       /* OrderService ProxyObject = (OrderService) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                                                    target.getClass().getInterfaces(),
                                                    new TimerInvocationHandler(target));*/
        //使用工具类中封装好的方法  简化代码
        OrderService ProxyObj = (OrderService) ProxyUtil.newProxyInstance(target);
        OrderService o = (OrderService) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                long begin = System.currentTimeMillis();
                //反射机制 调用目标对象的目标方法
                //调用方法四要素：调用哪个对象，的哪个方法 ，传什么参数，返回什么类型的值
                //target  调用的对象  OrderService target = new OrderServiceImpl();
                //method.invoke(setTarget(target), args); 调用的方法
                //args 传递的参数
                // Object Value 返回的值
                Object Value = method.invoke(target, args);
                long end = System.currentTimeMillis();
                System.out.println("耗时" + (end - begin) + "毫秒");
                return Value;
            }
        });
        //3.调用代理对象的代理方法
        //调用代理对象的代理方法的时候，如果要做增强，必须要保证目标对象的目标方法执行
        //使用匿名内部类实现的动态代理方法
        /*o.generate();
        o.modify();
        o.detail();
        String name = o.getName();
        System.out.println(name);*/
        ProxyObj.generate();
        ProxyObj.modify();
        ProxyObj.detail();
        String name = ProxyObj.getName();
        System.out.println(name);
    }
}
