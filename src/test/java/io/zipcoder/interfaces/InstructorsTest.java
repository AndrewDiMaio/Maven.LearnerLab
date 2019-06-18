package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorsTest {

    @Test
    public void getInstance() {
        Assert.assertEquals(5, Instructors.getInstance().personCount());
    }
}