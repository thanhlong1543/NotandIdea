package com.example.ambi.config;

import com.example.ambi.domain.Config;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
public class ApplicationConfig {

    @Autowired
    Config config;

    @Bean
    public DataSource dataSource() {
        PooledDataSource dataSource = new PooledDataSource();
        dataSource.setUsername(config.getDataSourceConfig().getUsername());
        dataSource.setPassword(config.getDataSourceConfig().getPassword());
        dataSource.setDriver(config.getDataSourceConfig().getDriver());
        dataSource.setUrl(config.getDataSourceConfig().getUrl());
        return dataSource;
    }

    @Bean
    public DataSourceTransactionManager dataSourceTransactionManager() {
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource());
        return dataSourceTransactionManager;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(dataSource());
        return sqlSessionFactory.getObject();
    }
}
