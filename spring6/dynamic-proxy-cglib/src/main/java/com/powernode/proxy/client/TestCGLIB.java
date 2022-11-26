package com.powernode.proxy.client;

import com.powernode.proxy.service.TimerMethodInterceptor;
import com.powernode.proxy.service.UserService;
import net.sf.cglib.proxy.Enhancer;

/**
 * @date 2022/11/4&0:06
 */
public class TestCGLIB {
    public static void main(String[] args) {
        //1.创建字节码增强器对象
        //这个对象是CGLIB库当中的核心对象，就是依靠他来生成代理类的
        Enhancer enhancer = new Enhancer();
        //2.告诉CGLIB父类是谁，告诉CGLIB目标类是谁
        enhancer.setSuperclass(UserService.class);
        //3.设置回调 相当于(JDK动态代理里面的调用处理器InvocationHandler)
        enhancer.setCallback(new TimerMethodInterceptor());
        /*
        设置回调也会做两件事情
        第一件事：在内存中生成UserService类的子类  其实就是代理对象的字节码class文件
        第二件事情：创建代理对象  通过字节码文件实例化代理对象
         */
        //因为代理对象是目标对象UserService的子类 所以其类型必定是UserService类型  可以直接强转

        UserService o = (UserService) enhancer.create();
        /*
        底层代码 相当于这个类
        com.powernode.proxy.service.UserService$$EnhancerByCGLIB$$82cb55e3@67117f44 extends UserService
        可以用输出的引用来判断是否使用了CGLIB框架去完成 动态代理模式
         */


        System.out.println(o);
        //调用代理对象中的代理方法
        boolean result = o.login("admin", "123456");
        System.out.println(result ? "登陆成功" : "登陆失败");
        o.logout();


    }
}
