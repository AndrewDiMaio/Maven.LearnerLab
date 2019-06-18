package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class InstructorTest {

    @Test
    public void teach() {
        double expected = 500.0;
        Student student = new Student(58585, "bob");
        Instructor teacher = new Instructor(39393, "smith");
        teacher.teach(student,expected);
        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual, .0003);
    }

    @Test
    public void lecture() {
        Learner[] students = new Learner[3];
        Student student = new Student(30030, "Richard");
        Student student1 = new Student(39393, "Tony");
        Student student2 = new Student(393933, "ssss");
        Instructor instructor = new Instructor(2020, "Smith");
        students[0] = student;
        students[1] = student1;
        students[2] = student2;
        instructor.lecture(students, 99.0);
        double expected = 33.0;
        double actual1 = student.getTotalStudyTime();
        double actual2 = student1.getTotalStudyTime();
        double actual3 = student2.getTotalStudyTime();

        Assert.assertEquals(expected, actual1, .003);
        Assert.assertEquals(expected, actual2, .003);
        Assert.assertEquals(expected, actual3, .003);

    }
}