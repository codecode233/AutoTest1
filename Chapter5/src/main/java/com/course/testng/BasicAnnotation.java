package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("测试用例1");
    }

    @Test
    public void testCase2(){
        System.out.println("测试用例2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod在测试方法之前运行的方法");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod在测试方法之后运行的方法");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("befoeClass在测试类运行之前运行的方法");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterClass在测试类运行之后运行的方法");
    }

    /*
    ****注解的执行顺序
     */
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite在测试套件之前执行");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite在测试套件之后执行");
    }
}
