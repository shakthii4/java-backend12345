package com.ani.springdata.jdbc.springdatajdbc.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class Dbconfig {
    @Bean
    public DataSource mysqlDataSource() {
        var ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/springdatabase");
        ds.setUsername("root");
        ds.setPassword("password");
        return ds;

    }
}
