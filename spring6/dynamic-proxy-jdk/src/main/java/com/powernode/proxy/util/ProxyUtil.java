package com.powernode.proxy.util;

import com.powernode.proxy.service.OrderService;
import com.powernode.proxy.service.TimerInvocationHandler;

import java.lang.reflect.Proxy;

/**
 * @date 2022/11/3&23:45
 */
public class ProxyUtil {
    public static Object newProxyInstance(Object target){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new TimerInvocationHandler(target));
    }
}
