package com.jhj.cloud.zipkin.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import zipkin.storage.mysql.MySQLStorage;

/**
 * 使用MySQL储存，默认为内存储存
 * 
 * @author zhangbo
 */
@Configuration
public class MysqlStorageConfig {

    @Bean
    public MySQLStorage mySQLStorage(DataSource datasource) {
        return MySQLStorage.builder().datasource(datasource).executor(Runnable::run).build();
    }
    
}
