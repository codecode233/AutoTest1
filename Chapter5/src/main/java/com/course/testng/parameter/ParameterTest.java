package com.course.testng.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * 通过xml文件传递参数
 *resources文件夹中新建的Parameter.xml文件，来传递参数进行运行
 */
public class ParameterTest {
    @Test
    @Parameters({"name","age"})
    public void parameterTest(String name,int age){
        System.out.println("name = "+name+";   age = "+age);
    }
}
