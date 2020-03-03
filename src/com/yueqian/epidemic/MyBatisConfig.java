package com.yueqian.epidemic;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;


@Configuration
@MapperScan(basePackages = "com.yueqian.epidemic.mapper")
public class MyBatisConfig {
    private Logger logger=Logger.getLogger(MyBatisConfig.class);

    /**
     * 配置数据源
     * @return
     */
    @Bean(name = "dataSource",destroyMethod = "close")
    public BasicDataSource basicDataSource(){
        BasicDataSource dataSource = new BasicDataSource();
        //设置驱动
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        //设置url
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/epidemic?useSSL=false&serverTimezone=UTC");
        //数据库登录用户名
        dataSource.setUsername("root");
        //登录密码
        dataSource.setPassword("123456");

        //设置连接池的初始化连接个数
        dataSource.setInitialSize(3);
        //设置连接池的最大连接个数
        dataSource.setMaxActive(50);
        //设置连接池的最大空闲个数
        dataSource.setMaxIdle(1);
        //设置最大等待时间4秒，超过4秒就意味着连接失败
        dataSource.setMaxWait(4000);
        //false表示为手动事务提交
        dataSource.setDefaultAutoCommit(false);
        return dataSource;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource){
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        //设置要使用的数据源
        factoryBean.setDataSource(dataSource);
        SqlSessionFactory factory=null;

        try {
            //设置映射xml文件的路径
            Resource[] resources = new PathMatchingResourcePatternResolver().getResources("classpath:com/yueqian/epidemic/mapper/*Mapper.xml");
            factoryBean.setMapperLocations(resources);
            //设置xml文件中的类所在的包
            factoryBean.setTypeAliasesPackage("com.yueqian.epidemic.beans");

            //为了让myBatis自动将下划线分隔的列名转换为驼峰表示的属性名
            org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
            configuration.setMapUnderscoreToCamelCase(true);
            factoryBean.setConfiguration(configuration);

            factory=factoryBean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("解析映射xml文件时异常:" + e.getMessage());
        }
        return factory;
    }


}
