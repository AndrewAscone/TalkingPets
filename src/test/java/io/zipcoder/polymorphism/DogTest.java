package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void dogConstructorTest(){
        Dog test = new Dog("Test");

        String expected = "Test";
        String actual = test.getName();

        Assert.assertEquals(expected, actual);
    }
}