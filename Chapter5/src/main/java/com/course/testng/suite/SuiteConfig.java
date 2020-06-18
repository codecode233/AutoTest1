package com.course.testng.suite;

import org.testng.annotations.*;

public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("befoe suite 运行啦");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("after suite 运行啦");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("beforeTest!");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("afterTest!");
    }






















}
