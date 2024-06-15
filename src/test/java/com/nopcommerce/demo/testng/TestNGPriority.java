package com.nopcommerce.demo.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

/**
 * Created by Jay Vaghani
 */
public class TestNGPriority {

    @Test(priority = 3)
    public void test1(){
        System.out.println("I am in test1");
    }

    @Ignore
    @Test(priority = 2)
    public void test2(){
        System.out.println("I am in test2");
    }

    @Test()
    public void test(){
        System.out.println("I am in test");
    }

}
