package com.nopcommerce.demo.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * Created by Jay Vaghani
 */
public class TestNGSoftAssert {

    @Test
    public void testSum() {
        int a = 10;
        int b = 20;
        int result = a + b;
        System.out.println("Running test --------------->");
        Assert.assertTrue(result == 40);
        System.out.println("Line After assert 1");
        Assert.assertTrue(result == 30);
        System.out.println("Line After assert 2");
    }

    @Test
    public void testSum1() {
        SoftAssert softAssert = new SoftAssert();
        int a = 10;
        int b = 20;
        int result = a + b;
        System.out.println("Running test --------------->");
        softAssert.assertTrue(result == 30,"First Assert");
        System.out.println("Line After assert 1");
        softAssert.assertTrue(result == 30, "Second Assert");
        System.out.println("Line After assert 2");
        softAssert.assertAll();
    }

}
