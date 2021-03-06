/*
 * Copyright (c) 2017 wupj e-mail:wpjlovehome@gmail.com
 */

/*
 * ©2016 wupjhy.cn.  All rights reserved.
 */

package com.wpj.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by WPJ587 on 2015/9/30.
 */
@Component("druidDataSourceEntity")
@ConfigurationProperties(value = "spring.datasource",locations = "classpath:application.properties",ignoreNestedProperties = false)
public class DruidDataSourceEntity {
    private String driverClassName;
    private String url;
    private String username;
    private String password;
    private int maxActive = 20;
    private int maxIdle = 20;
    private int minIdle = 1;
    private int initialSize = 1;
    private int maxWait = 60000;
    private int timeBetweenEvictionRunsMillis=60000;
    private int minEictableIdleTimeMillis=300000;
    private boolean testOnBorrow = false;
    private boolean testOnReturn = false;
    private boolean testWhileIdle=true;
    private String validationQuery;
    private boolean poolPreparedStatements=false;
    private int maxOpenPreparedStatements=20;
    private String filters="stat";

    public DruidDataSourceEntity() {
        System.out.println("创建");
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMaxActive() {
        return maxActive;
    }

    public void setMaxActive(int maxActive) {
        this.maxActive = maxActive;
    }

    public int getMaxIdle() {
        return maxIdle;
    }

    public void setMaxIdle(int maxIdle) {
        this.maxIdle = maxIdle;
    }

    public int getMinIdle() {
        return minIdle;
    }

    public void setMinIdle(int minIdle) {
        this.minIdle = minIdle;
    }

    public int getInitialSize() {
        return initialSize;
    }

    public void setInitialSize(int initialSize) {
        this.initialSize = initialSize;
    }

    public int getMaxWait() {
        return maxWait;
    }

    public void setMaxWait(int maxWait) {
        this.maxWait = maxWait;
    }

    public int getTimeBetweenEvictionRunsMillis() {
        return timeBetweenEvictionRunsMillis;
    }

    public void setTimeBetweenEvictionRunsMillis(int timeBetweenEvictionRunsMillis) {
        this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
    }

    public int getMinEictableIdleTimeMillis() {
        return minEictableIdleTimeMillis;
    }

    public void setMinEictableIdleTimeMillis(int minEictableIdleTimeMillis) {
        this.minEictableIdleTimeMillis = minEictableIdleTimeMillis;
    }

    public boolean isTestOnBorrow() {
        return testOnBorrow;
    }

    public void setTestOnBorrow(boolean testOnBorrow) {
        this.testOnBorrow = testOnBorrow;
    }

    public boolean isTestOnReturn() {
        return testOnReturn;
    }

    public void setTestOnReturn(boolean testOnReturn) {
        this.testOnReturn = testOnReturn;
    }

    public boolean isTestWhileIdle() {
        return testWhileIdle;
    }

    public void setTestWhileIdle(boolean testWhileIdle) {
        this.testWhileIdle = testWhileIdle;
    }

    public String getValidationQuery() {
        return validationQuery;
    }

    public void setValidationQuery(String validationQuery) {
        this.validationQuery = validationQuery;
    }

    public boolean isPoolPreparedStatements() {
        return poolPreparedStatements;
    }

    public void setPoolPreparedStatements(boolean poolPreparedStatements) {
        this.poolPreparedStatements = poolPreparedStatements;
    }

    public int getMaxOpenPreparedStatements() {
        return maxOpenPreparedStatements;
    }

    public void setMaxOpenPreparedStatements(int maxOpenPreparedStatements) {
        this.maxOpenPreparedStatements = maxOpenPreparedStatements;
    }

    public String getFilters() {
        return filters;
    }

    public void setFilters(String filters) {
        this.filters = filters;
    }

    @Override
    public String toString() {
        return "DruidDataSourceEntity{" +
                "driverClassName='" + driverClassName + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", maxActive=" + maxActive +
                ", maxIdle=" + maxIdle +
                ", minIdle=" + minIdle +
                ", initialSize=" + initialSize +
                ", maxWait=" + maxWait +
                ", timeBetweenEvictionRunsMillis=" + timeBetweenEvictionRunsMillis +
                ", minEictableIdleTimeMillis=" + minEictableIdleTimeMillis +
                ", testOnBorrow=" + testOnBorrow +
                ", testOnReturn=" + testOnReturn +
                ", testWhileIdle=" + testWhileIdle +
                ", validationQuery='" + validationQuery + '\'' +
                ", poolPreparedStatements=" + poolPreparedStatements +
                ", maxOpenPreparedStatements=" + maxOpenPreparedStatements +
                ", filters='" + filters + '\'' +
                '}';
    }
}
