package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void learn() {
        Student person = new Student(49949, "bob");
        person.learn(500.0);
        double expected = 500.0;
        double actual = person.getTotalStudyTime();

        Assert.assertEquals(expected,actual,.0004);
    }
}