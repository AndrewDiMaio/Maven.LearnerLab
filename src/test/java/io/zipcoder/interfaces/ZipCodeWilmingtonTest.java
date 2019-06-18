package io.zipcoder.interfaces;

import org.junit.Test;

import java.util.Map;
import java.util.Random;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {

    @Test
    public void hostLectureTest2() {
        ZipCodeWilmington zcw = new ZipCodeWilmington();
        Students students = Students.getInstance();
        zcw.hostLecture(5, 64.0);
        Student bob = students.findById(5L);
        Double expected = 16.0;
        Double actual = bob.getTotalStudyTime();
        assertEquals(expected, actual, 0.01);
    }
}