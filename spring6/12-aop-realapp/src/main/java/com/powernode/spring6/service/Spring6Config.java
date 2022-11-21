package com.powernode.spring6.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @date 2022/11/4&22:09
 */
@ComponentScan("com.powernode.spring6")
@EnableAspectJAutoProxy()  //开启aspectj框架  强制使用cglib动态代理
public class Spring6Config {
}
