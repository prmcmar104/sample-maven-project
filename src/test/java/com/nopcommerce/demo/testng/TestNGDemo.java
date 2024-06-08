package com.nopcommerce.demo.testng;

import org.testng.annotations.*;

/**
 * Created by Jay Vaghani
 */
public class TestNGDemo {

    @BeforeTest
    public void beforeTest(){
        System.out.println("I am in before Test");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("I am in after Test");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I am in before method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("I am in after method");
    }

    @Test
    public void test1(){
        System.out.println("I am in test1");
    }

    @Test
    public void test2(){
        System.out.println("I am in test2");
    }
}
