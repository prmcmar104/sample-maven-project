package com.nopcommerce.demo.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by Jay Vaghani
 */
public class TestNGParameterDemo {

    @Test
    @Parameters({"myName", "surname"})
    public void test(@Optional("Jay") String name, @Optional("Vaghani") String surname) {
        System.out.println("My name is " + name);
        System.out.println("My surname is " + surname);
    }

}
