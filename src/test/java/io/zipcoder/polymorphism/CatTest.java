package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void catConstructorTest(){
        Cat test = new Cat("Test");

        String expected = "Test";
        String actual = test.getName();

        Assert.assertEquals(expected, actual);
    }
}