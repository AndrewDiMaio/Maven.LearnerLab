package io.zipcoder.interfaces;

import org.junit.Test;

import java.util.Map;
import java.util.Random;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {

    @Test
    public void hostLectureTest() {
        ZipCodeWilmington zcw = new ZipCodeWilmington();
        Students students = Students.getInstance();
        zcw.hostLecture(5, 64.0);
        Student bob = (Student)students.findById(5L);
        Double expected = 12.8;
        Double actual = bob.getTotalStudyTime();
        assertEquals(expected, actual, 0.01);
    }
}