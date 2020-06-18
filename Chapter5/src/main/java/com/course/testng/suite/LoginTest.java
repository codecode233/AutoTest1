package com.course.testng.suite;

import org.testng.annotations.*;

public class LoginTest {

    @Test
    public void loginTaoBao(){
        System.out.println("淘宝登陆成功");
    }


    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BeforeMethod在测试方法之前运行的方法");
    }

    @AfterMethod
    public void afterMethod() {
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

}
