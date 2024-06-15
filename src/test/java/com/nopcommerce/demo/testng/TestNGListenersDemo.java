package com.nopcommerce.demo.testng;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

/**
 * Created by Jay Vaghani
 */
//@Listeners(TestNGListeners.class)
public class TestNGListenersDemo {

    @Test
    public void test1() {
        System.out.println("I am inside Test1");
    }

    @Test
    public void test2() {
        System.out.println("I am inside Test2");
        Assert.fail();
    }

    @Test
    public void test3() {
        System.out.println("I am inside Test3");
        throw new SkipException("Test Skipped");
    }
}
