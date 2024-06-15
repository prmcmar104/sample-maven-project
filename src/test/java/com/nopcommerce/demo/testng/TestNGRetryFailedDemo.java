package com.nopcommerce.demo.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Jay Vaghani
 */
public class TestNGRetryFailedDemo {

    @Test()
    public void test1(){
        System.out.println("I am in test1");
    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void test2(){
        System.out.println("I am in test2");
        Assert.fail();
    }

    @Test()
    public void test3(){
        System.out.println("I am in test3");
    }
}
