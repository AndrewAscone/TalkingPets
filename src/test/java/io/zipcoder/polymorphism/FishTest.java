package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class FishTest {

    @Test
    public void fishConstructorTest(){
        Fish test = new Fish("Test");

        String expected = "Test";
        String actual = test.getName();

        Assert.assertEquals(expected, actual);
    }
}