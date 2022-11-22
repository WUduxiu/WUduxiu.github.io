package com.powernode.bank;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @date 2022/11/5&13:11
 */
@Configuration
@ComponentScan("com.powernode.bank") //组件扫描
@EnableTransactionManagement //开启事务注解
public class Spring6Config {
    //使用@Bean注解去配置Bean 将该对象纳入Spring容器管理
    //spring框架，看到这个@Bean注解后，会调用这个被标注的方法，这个方法的返回值是一个java对象，这个java对象会自动纳入Spring容器管理
    //返回的对象就是spring容器中的一个对象了  这个Bean的id 就是这里的name
    @Bean(name = "dataSource")//配置druid数据池对象
    public DruidDataSource getDataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/spring6");
        dataSource.setUsername("root");
        dataSource.setPassword("wutianzi123.");
        return dataSource;
    }
    //配置JdbcTemplate对象
    @Bean(name = "jdbcTemplate")
    //spring在调用这个方法的时候 先会去spring容器里面找
    //在容器中有这类型的类的话  就会根据类型 进行自动注入
    public JdbcTemplate getJdbcTemplate(DataSource dataSource){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }
    //配置事务管理器
    @Bean(name = "txManger")
    public DataSourceTransactionManager getTxManger(DataSource dataSource){
        DataSourceTransactionManager txManger = new DataSourceTransactionManager();
        txManger.setDataSource(dataSource);
        return txManger;
    }
}
