package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class ZipCodeWilmington {
    private static ZipCodeWilmington ourInstance = new ZipCodeWilmington();
    private static Students students = Students.getInstance();
    private static Instructors instructors = Instructors.getInstance();

    public static ZipCodeWilmington getInstance() {
        return ourInstance;
    }

    ZipCodeWilmington() {

    }

    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture((Learner[])students.toArray(),numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){
        Instructor teacher = (Instructor)instructors.findById(id);
        teacher.lecture((Learner[])students.toArray(),numberOfHours);
    }

    public Map<Student, Double> getStudyMap(){
        Map<Student, Double> studentMap = new HashMap<>();
        for (Student student: (Iterable<Student>) students){
            studentMap.put(student, student.getTotalStudyTime());
        }return studentMap;

    }
}
