package com.nopcommerce.demo.testng;

import org.testng.annotations.Test;

/**
 * Created by Jay Vaghani
 */
public class TestNGGrouping {

    @Test(groups = {"sanity", "regression"})
    public void loginTest1() {
        System.out.println("Running test - loginTest1");
    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void loginTest2() {
        System.out.println("Running test - loginTest2");
    }

    @Test(groups = {"smoke", "regression1", "regression"})
    public void loginTest3() {
        System.out.println("Running test - loginTest3");
    }

    @Test(groups = {"smoke", "regression1", "regression"})
    public void loginTest4() {
        System.out.println("Running test - loginTest4");
    }

    @Test(groups = {"regression1", "regression"})
    public void regressionTest1() {
        System.out.println("Running test - regressionTest1");
    }

    @Test(groups = {"regression1", "regression"})
    public void regressionTest2() {
        System.out.println("Running test - regressionTest2");
    }

    @Test(groups = "regression")
    public void regressionTest3() {
        System.out.println("Running test - regressionTest3");
    }
}