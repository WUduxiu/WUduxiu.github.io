package cn.powernode.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @date 2022/11/2&20:19
 *  写一个类，代替Spring6框架的配置文件
 */
@Configuration//代表现在这个类是一个配置文件的类了
@ComponentScan({"cn.powernode.dao","cn.powernode.service"})
public class Spring6Config {
}
