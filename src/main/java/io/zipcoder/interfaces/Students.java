package io.zipcoder.interfaces;

public final class Students extends People {
    private static Students ourInstance = new Students();

    public static Students getInstance() {
        return ourInstance;
    }

    private Students() {
        super.addPerson(new Student(1, "Anish"));
        super.addPerson(new Student(2, "Ben"));
        super.addPerson(new Student(3, "Dan"));
        super.addPerson(new Student(4, "Bob"));
        super.addPerson(new Student(5, "Ed"));
    }
}
