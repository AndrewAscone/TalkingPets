package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class MainApplicationTest {
    @Test
    public void petInputTest(){
        String type = "Dog";
        String name = "Radar";

        Pet expected = new Dog("Radar");
        Pet actual = MainApplication.petFromInput(type, name);

        Assert.assertEquals(expected.getName(), actual.getName());
    }

}