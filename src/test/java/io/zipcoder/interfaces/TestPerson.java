package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void testConstructor(){
        Person person = new Person(393993939L, "Bob");
        String expected = "Bob";
        String actual = person.getName();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testSetName(){
        Person person = new Person (4884848, "");
        person.setName("Bob");

        String expected = "Bob";
        String actual = person.getName();

        Assert.assertEquals(expected,actual);
    }

}
