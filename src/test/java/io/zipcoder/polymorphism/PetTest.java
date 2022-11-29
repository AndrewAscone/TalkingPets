package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class PetTest {

    @Test
    public void getNameTest(){
        Pet test = new Pet("Name");

        String expected = "Name";
        String actual = test.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest(){
        Pet test = new Pet("Name");
        test.setName("New");

        String expected = "New";
        String actual = test.getName();

        Assert.assertEquals(expected, actual);


    }

    @Test
    public void petConstructorTest(){
        Pet test = new Pet("Name");

        String expected = "Name";
        String actual = test.getName();

        Assert.assertEquals(expected, actual);

    }
}