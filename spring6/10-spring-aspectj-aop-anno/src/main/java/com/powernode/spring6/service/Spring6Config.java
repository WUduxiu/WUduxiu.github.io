package com.powernode.spring6.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @date 2022/11/4&21:30
 */
@Configuration  //代替xml文件
@ComponentScan("com.powernode.spring6.service")//组件扫描
@EnableAspectJAutoProxy(proxyTargetClass = true)//启用aspectj的自动代理模式  参数为true时 则表示强制使用CGLIB代理
public class Spring6Config {
}
