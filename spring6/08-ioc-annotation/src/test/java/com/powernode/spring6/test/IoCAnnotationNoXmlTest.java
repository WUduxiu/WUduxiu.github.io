package com.powernode.spring6.test;

import cn.powernode.service.Spring6Config;
import cn.powernode.service.StudentService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @date 2022/11/2&20:22
 */
public class IoCAnnotationNoXmlTest {
    @Test
    //全注解开发 没有配置xml文件
    public void testNoXML(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Spring6Config.class);
        StudentService studentService = context.getBean("studentService", StudentService.class);
        studentService.deleteStudent();
    }
}
