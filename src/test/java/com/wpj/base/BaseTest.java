/*
 * Copyright (c) 2017 wupj e-mail:wpjlovehome@gmail.com
 */

package com.wpj.base;

import com.wpj.ChatApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.ConfigFileApplicationContextInitializer;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * projectName：com-byteslounge-websockets
 * Time：2015/11/16 15:05
 * author：WPJ587
 * description：测试的基类
 **/
@RunWith(SpringJUnit4ClassRunner.class)
//@WebAppConfiguration
@ContextConfiguration(classes = ChatApplication.class,
        initializers = ConfigFileApplicationContextInitializer.class)
@WebIntegrationTest({"server.port=0", "management.port=0"})
//@TransactionConfiguration(defaultRollback = true)
@Transactional("transactionManager")
public class BaseTest {
    @Test
    public void start(){
        System.out.println("Test..........");
    }
}
