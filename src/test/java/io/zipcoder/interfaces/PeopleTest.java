package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PeopleTest {

    @Test
    public void addPersonTest(){
        Student person = new Student(200, "bob");
        Instructor teacher = new Instructor(39393, "smith");
        People people = new People();

        people.addPerson(person);
        people.addPerson(teacher);

        int expected = 2;
        int actual = people.personCount();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void removePerson() {
        Student person = new Student(200, "bob");
        Instructor teacher = new Instructor(39393, "smith");
        People people = new People();

        people.addPerson(person);
        people.addPerson(teacher);
        people.removePerson(teacher);
        int expected = 1;
        int actual = people.personCount();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeById() {
        Student person = new Student(200, "bob");
        Instructor teacher = new Instructor(39393, "smith");
        People people = new People();

        people.addPerson(person);
        people.addPerson(teacher);
        people.removeById(200L);
        int expected = 1;
        int actual = people.personCount();

        Assert.assertEquals(expected, actual);
    }
}